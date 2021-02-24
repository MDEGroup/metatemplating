package metaGen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (String path : args) {
			
			System.out.println("Directory: " + path);

			File dir = new File(path);
			File[] directoryListing = dir.listFiles();
			if (directoryListing != null) {
				for (File child : directoryListing) {
					// Do something with child

					try {
						String text = "";
						System.out.println("Processing: " + child.getName());

						// Read file
						Scanner myReader = new Scanner(child);

						while (myReader.hasNextLine()) {
							String data = myReader.nextLine();
							text += data + "\n";
						}
						myReader.close();

						// Cleanup
						Cleaner cleaner = Cleaner.Build().setText(text);

						// Write back
						if (child.createNewFile()) {
							System.out.println("File created: " + child.getName());
						} else {
							System.out.println("File already exists");
						}
						FileWriter myWriter = new FileWriter(child);
						myWriter.write(cleaner.clean().getText());
						myWriter.close();

					} catch (FileNotFoundException e) {
						System.out.println("File not found");
//						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("An error occurred");
//						e.printStackTrace();
					}
				}
			} else {
				// Handle the case where dir is not really a directory.
				// Checking dir.isDirectory() above would not be sufficient
				// to avoid race conditions with another process that deletes
				// directories.
			}

		}

	}

}
