package org.xtext.example.mydsl.generator;

import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.types.EolPrimitiveType;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage;

public class RunEgxEngine {
	private static final String MODEL_ALIAS = "src";
	private static final String ENGINE_MAIN = "/main.egx";

	public static void run(Resource resource, IFileSystemAccess2 fsa) {
		System.out.println("Running EGX...");
		RunEgxEngine engine = new RunEgxEngine();

		// Parse main.egx
		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		try {
			URL url = FileLocator.toFileURL(new URL(resource.getURI().toString()));
			String source = url.getFile();
			source = source.substring(source.lastIndexOf("/") + 1, source.indexOf(".mt"));

			factory.setOutputRoot(FileLocator.toFileURL(new URL(fsa.getURI("").toString())).getPath());
			EgxModule module = new EgxModule(factory);
			
			// Adding parameters
			Variable parameters = new Variable("outputName", source + ".egl", EolPrimitiveType.String);
			module.getContext().getFrameStack().put(parameters);

//			module.parse(new File("epsilon/main.egx").getAbsoluteFile());
//			System.out.println("Engine file: " + engine.getClass().getResource("/main.egx").toURI());
			module.parse(engine.getClass().getResource(ENGINE_MAIN).toURI());

			if (!module.getParseProblems().isEmpty()) {
				System.out.println("Syntax errors found. Exiting.");
				return;
			}

			// In memory model
			InMemoryEmfModel model = new InMemoryEmfModel(MODEL_ALIAS, resource, MetaTemplatingPackage.eINSTANCE);
			model.setCachingEnabled(false);

//			// Load the XML document
//			PlainXmlModel model = new PlainXmlModel();
//			model.setFile(new File("library.xml"));
//			model.setName("L");
//			model.load();

			// Make the document visible to the EGX program
			module.getContext().getModelRepository().addModel(model);
			// ... and execute
			module.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Done.");
	}
}
