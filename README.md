# SQML Eclipse Plugin

The _SQML Eclipse Plugin_ is an [Eclipse](https://www.eclipse.org/) plugin that implements the _SoftiCAR Query and Modeling Language (SQML)_, which is a domain-specific language ([DSL](https://en.wikipedia.org/wiki/Domain-specific_language)) to define database table structures and database queries. The _SQML Eclipse Plugin_ is based on the [Xtext framework](https://www.eclipse.org/Xtext/).

## Main Features

The _SQML Eclipse Plugin_ provides the following features.

- Tables
  - database table structures can be defined and validated
  - [Java](https://en.wikipedia.org/wiki/Java) code can be generated to query and write table records
  - `CREATE TABLE`-statements can be generated to initialize a [DBMS](https://en.wikipedia.org/wiki/Database) instance
- Queries
  - queries can be defined in an [SQL](https://en.wikipedia.org/wiki/SQL)-like manner
  - queries can be validated with respect to the defined table structures
  - [Java](https://en.wikipedia.org/wiki/Java) code can be generated to execute the queries

## Runtime Requirements

To write _SQML_ code, the following is required:

- Java SDK 15+, e.g. [OpenJDK](https://adoptopenjdk.net/)
- [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/), e.g. 2020-09 (4.17) or higher
- _SQML Eclipse Plugin_

:warning: There is currently no publicly available update site to download the _SQML Eclipse Plugin_ from. This will change when our migration to _Github_ is completed. Until then, an organization has to build and publish the plugin internally.

## Development

To contribute to the source code, an installation of the [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/) is required with an installed [Xtext plugin](https://www.eclipse.org/Xtext/download.html). Please read the [contribution guidelines](CONTRIBUTING.md) for this repository and keep our [code of conduct](CODE_OF_CONDUCT.md) in mind.

### Building

To build the source code, the [SoftiCAR Platform](https://github.com/softicar/platform) needs to be accessible on [Maven Central](https://search.maven.org/).

External dependencies are bundled by the `com.softicar.sqml.shared` subproject and dependency resolution is done by the [Gradle Build Tool](https://gradle.org/). To gather external dependencies, execute this:
```
cd com.softicar.sqml.shared
../gradlew syncSharedDependencies
```

The projects can now be imported without errors into [Eclipse](https://www.eclipse.org/) with _Import ... Existing Projects into Workspace_. Future updates may require repeated execution of the `syncSharedDependencies` task when dependencies changed.

### Testing

Automated testing through the continuous integration workflow is currently not implemented. Thus, testing must be executed manually from Eclipse on the projects `com.softicar.sqml.generator` and `com.softicar.sqml.tests`.

### Publishing

Publication is done in three steps.
1. First generate the artifacts by opening the file `com.softicar.sqml.site/site.xml` in _Eclipse_ and pressing the `Build All` button.
2. Upload the artifacts by executing the `com.softicar.sqml.site/upload` script.
3. Cleanup everything by running the `com.softicar.sqml.site/cleanup` script.

For the `upload` script to work, the `~/.softicar/build.properties` file needs to be configured:
```
com.softicar.sqml.upload.url = <user>@<host>:/<path>/
```
