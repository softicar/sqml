# SoftiCAR Query and Modeling Language (SQML)

The _SoftiCAR Query and Modeling Language (SQML)_ is a domain-specific language ([DSL](https://en.wikipedia.org/wiki/Domain-specific_language)) to define database table structures and database queries. It is implemented as an [Eclipse](https://www.eclipse.org/) plugin based on the [Xtext framework](https://www.eclipse.org/Xtext/).

## Main Features

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
- SQML Eclipse Plugin

:warning: There is currently no publicly available update site to download the _SQML Eclipse Plugin_ from. This will change when our migration to _Github_ is completed.

## Development

To contribute to the source code, an installation of the [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/) is required with an installed [Xtext plugin](https://www.eclipse.org/Xtext/download.html).

### Building

To build the source code, the [SoftiCAR Gradle Plugins](https://github.com/Prevent-DEV/com.softicar.gradle.plugin) is necessary, as well as a `.softicar/build.properties` file with a configured `com.softicar.ivy.repository.url` property.
```
com.softicar.ivy.repository.url = https://host/path/
```

External dependencies are bundled by the `com.softicar.sqml.shared` subproject and dependency resolution is done by _Gradle_. To gather external dependencies, execute this:
```
cd com.softicar.sqml.shared
../gradlew syncSharedDependencies
```

The projects can now be imported without errors into _Eclipse_. Future updates may require repeated execution of the `syncSharedDependencies` task when dependencies changed.

### Publishing

Publication is done in three steps.
1. First generate the artifacts by opening the file `com.softicar.sqml.site/site.xml` in _Eclipse_ and pressing the `Build All` button.
2. Upload the artifacts by executing the `com.softicar.sqml.site/upload` script.
3. Cleanup everything by running the `com.softicar.sqml.site/cleanup` script.

For the `upload` script to work, the `~/.softicar/build.properties` file needs to be configured:
```
com.softicar.sqml.upload.url = <user>@<host>:/<path>/
```
