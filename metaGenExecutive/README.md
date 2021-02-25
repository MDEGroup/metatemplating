# Meta Templating Example in IoT domain

[![mde meta-templating](https://img.shields.io/badge/mde-meta--templating-blue)](https://github.com/MDEGroup/metatemplating)

This is an example project which illustrates the workflow of a meta-templating process on a real case of study in the IoT domain.

<!-- This is a long description. -->

## Table of Contents

- [Background](#background)
- [Install](#install)
- [Usage](#usage)
- [API](#api)
- [Contributing](#contributing)
- [License](#license)


## Background


## Install


```
```


## Usage

### Phase 1:
In the first design iteration the IoT domain has been represented designing the metamodel iot1.ecore-domain.
After the design phase, it has been annotated correctly following the defined patterns, into the metamodel iot1.ecore.

A model iot1.xmi was designed based on iot1.ecore.

There were defined meta-templates IotHal.egl and IotStartup.egl to accomplish the generation of Adapters and Pin Initializer respectively. There was also defined a template (IotMain.egl) to generate a coordinator to launch the instace-templates.

Step1: instace-templates generation
Using the iotMetaMain_1 launch configuration it is possible to run the meta-template engine on the previous indicated meta-templates to generate the respective instance-templates into the /templates folder. Also the coordinator will be generated here.

Step2: artifacts generation
Using the iotMain_1 launch configuration it is possible to run the generated instace-templates based on iot1.ecore using iot1.xmi model. Generated code artifacts will be put in /output folder.

### Phase 2:
In the second design iteration the IoT domain has been represented designing the metamodel iot2.ecore-domain.
After the design phase, it has been annotated correctly following the defined patterns, into the metamodel iot2.ecore.

A model MultiSystem.xmi was designed based on iot2.ecore, starting from the merge of iot1.xmi and iot2.xmi into a single multi-system.

Step1: instace-templates generation
Using the iotMetaMain_2 launch configuration it is possible to run the meta-template engine on the previous indicated meta-templates to upgrade the respective instance-templates into the /templates folder. Also the coordinator will be upgraded here.

Step2: artifacts generation
Using the iotMain_2 launch configuration it is possible to run the upgraded instace-templates based on iot2.ecore using MultiSystem.xmi model. Generated code artifacts will be put in /output folder.

### Phase 3:
There was defined the meta-template IotDs.egl to accomplish the generation of Data Structures. There was also defined a template (IotMain2.egl) to generate a coordinator to launch the instace-templates.

Step1: instace-templates generation
Using the iotMetaMain2 launch configuration it is possible to run the meta-template engine on all previous indicated meta-templates to generate the respective instance-templates into the /templates folder. Also the coordinator will be generated here.

Step2: artifacts generation
Using the iotMain2 launch configuration it is possible to run the generated instace-templates based on iot2.ecore using MultiSystem.xmi model. Generated code artifacts will be put in /output folder.

## API



## Contributing

This project exists thanks to all the people who contribute. 
<a href="https://github.com/MDEGroup/metatemplating/graphs/contributors">Contributors</a>


## License

[GNU AGPLv3](LICENSE.txt) © Tiziano Lombardi, Università degli Studi de L'Aquila, IT