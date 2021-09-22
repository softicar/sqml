# SoftiCAR Query and Modeling Language (SQML)

The _SoftiCAR Query and Modeling Language (SQML)_ is a domain-specific language ([DSL](https://en.wikipedia.org/wiki/Domain-specific_language)) to define database table structures and database queries.

## Main Features

- Tables
  - table structures can be defined and validated
  - [Java](https://en.wikipedia.org/wiki/Java) code can be generated to query and write table records
  - `CREATE TABLE`-statements can be generated to initialize a [DBMS](https://en.wikipedia.org/wiki/Database) instance
- Queries
  - queries can be defined in an [SQL](https://en.wikipedia.org/wiki/SQL)-like manner
  - queries can be validated with respect to the defined table structures
  - [Java](https://en.wikipedia.org/wiki/Java) code can be generated to execute the queries

## Requirements

- Java SDK 15+, e.g. [OpenJDK](https://adoptopenjdk.net/)
- [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/), e.g. 2020-09 (4.17) or higher

## Building

To build the source code, the [SoftiCAR Gradle Plugins](https://github.com/Prevent-DEV/com.softicar.gradle.plugin) is necessary, as well as a `.softicar/build.properties` file, with a configured `com.softicar.ivy.repository.url` property.
```
com.softicar.ivy.repository.url = https://host/path/
```

External dependencies are bundled by the `com.softicar.sqml.shared` subproject. Dependency resolution is done by _Gradle_. To gather external dependencies, execute this:
```
cd com.softicar.sqml.shared
../gradlew syncSharedDependencies
```
