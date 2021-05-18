# Meta Templating Editor for Hotello

[![mde meta-templating](https://img.shields.io/badge/mde-meta--templating-blue)](https://github.com/MDEGroup/metatemplating)

This is the main xtext project which realizes the textual editor of our meta-templating language called Hotello.

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

Import all **"org.xtext.metatemplating.*"** projects in your Eclipse (remember to install Xtext first!).
Then, run a new Eclipse instance (Run as -> Eclipse Application), and you'll get the environment ready to code Hotello!

**Note** that when you use Hotello framework it generates meta-template files in the folder **/src-gen** of the in-use project.

<!--
```
```
-->

## Usage

To write an Hotello meta-template just create a new file in the in-use project (Java, Modeling, ...) with **.mt extension**.
Everytime the file is modifed and saved the EGL executive meta-template is automatically regenerated.

**Note** that to have a clear and user-customizable management of output identation (which is mandatory for such artifacts as 
Python source code) Hotello has been enriched with special markers to insert single-space, tabulation and line-feed 
(namely \#s, \#t, \#n).

Other escaped sequences have been defined to let users use reserved characters allocated for Hotello synatx (i.e. \#{, \#}, \#; ...)
In order to "escape" an entire string you can use @{ &lt;the_string_you_want&gt; }@
Finally, if you want to insert comments in the EGL meta-template use \#\* &lt;your_comment_multiline&gt; \*\#

In order to use the EGL meta-template artifacts proceed along these two steps:

### Step 1: Metamodel level

Create a launch configuration for the EGL meta-template passing as input EMF model the desired version of domain metamodel, 
and a **string** parameter called **"_source"** with the Source field value used by metamodel annotations. Set the output file/directory wherever you prefer.
Thus, the model-level EGL template is generated.

### Step 2: Model level

Create a launch configuration for the EGL template passing as input EMF model the desired model conform to the metamodel used
in the previous step. Set the output file/directory wherever you prefer.
Thus, the final artifact is generated.

## API



## Contributing

This project exists thanks to all the people who contribute. 
<a href="https://github.com/MDEGroup/metatemplating/graphs/contributors">Contributors</a>


## License

[GNU AGPLv3](LICENSE.txt) © Tiziano Lombardi, Università degli Studi de L'Aquila, IT