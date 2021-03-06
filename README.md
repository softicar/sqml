# SQML Eclipse Plugin

The _SQML Eclipse Plugin_ is an [Eclipse](https://www.eclipse.org/) plugin that implements the _SoftiCAR Query and Modeling Language (SQML)_, which is a domain-specific language ([DSL](https://en.wikipedia.org/wiki/Domain-specific_language)) to define database table structures and database queries. The _SQML Eclipse Plugin_ is based on the [Xtext framework](https://www.eclipse.org/Xtext/).

## 1 Main Features

The _SQML Eclipse Plugin_ provides the following features.

- Tables
  - Database table structures can be defined and validated
  - [Java](https://en.wikipedia.org/wiki/Java) code is generated from table definitions.
  - The generated code realizes the [Active Record pattern](https://en.wikipedia.org/wiki/Active_record_pattern). It enables [object-relational mapping](https://en.wikipedia.org/wiki/Object%E2%80%93relational_mapping), and [CRUD](https://en.wikipedia.org/wiki/Create,_read,_update_and_delete) operations on database records.
  - `CREATE TABLE` statements can be generated to initialize a [DBMS](https://en.wikipedia.org/wiki/Database) instance.
- Queries
  - Queries can be defined in an [SQL](https://en.wikipedia.org/wiki/SQL)-like manner
  - Queries can be validated with respect to the defined table structures
  - [Java](https://en.wikipedia.org/wiki/Java) code can be generated to execute the queries

## 2 Runtime Requirements

To write _SQML_ code in another project, an **Ubuntu 20.04 (Focal)** based workstation is recommended, with the following software installed:

1. [AdoptOpenJDK 15 with HotSpot JVM](https://adoptopenjdk.net/archive.html?variant=openjdk15&jvmVariant=hotspot), with `java` in the `PATH` _(an upgrade to Adoptium JDK 17 LTS is planned)_
2. [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/), e.g. [2020-09 (4.17)](https://www.eclipse.org/downloads/packages/release/2020-09/r)
3. [SQML Eclipse Plugin](https://github.com/softicar/sqml)

## 3 Installation

To install the _SQML Eclipse Plugin_, follow the instructions on our [Eclipse update site](https://softicar.github.io/sqml/).

## 4 Building and Development

To build the source code, an installation of the [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/) is required with an installed [Xtext plugin](https://www.eclipse.org/Xtext/download.html).

### 4.1 Building

To build the source code, the [SoftiCAR Platform](https://github.com/softicar/platform) needs to be accessible on [Maven Central](https://search.maven.org/).

External dependencies are bundled by the `com.softicar.sqml.shared` subproject and dependency resolution is done by the [Gradle Build Tool](https://gradle.org/). To gather external dependencies, execute this:
```
cd com.softicar.sqml.shared
./gradlew syncSharedDependencies
```

The projects can now be imported without errors into [Eclipse](https://www.eclipse.org/) with _Import ... Existing Projects into Workspace_. Future updates may require repeated execution of the `syncSharedDependencies` task when dependencies changed.

### 4.2 Testing

Automated testing through the continuous integration workflow is currently not implemented. Thus, testing must be executed manually from Eclipse on the projects `com.softicar.sqml.generator` and `com.softicar.sqml.tests`.

## 5 Releases and Versioning

Releases of this repository follow the [Semantic Versioning](https://semver.org/) principle.

```
     1.2.3
    /  |  \
major  |  patch
     minor
```

1. If there was an **API break** since the previous release, the **major version** is incremented: `1.2.3 -> 2.0.0` -- API breaks include:
   - Incompatible changes to existing Java code which is part of the API; most notably: changes to (or removal of) `public`/`protected` classes/fields/methods/signatures
   - Changes in the behavior of existing Java code (except fixes of defective behavior)
   - _Any_ change to a database table
   - Fundamental changes to the behavior or style of the UI
1. If there was **no API break** but a **new feature** was added, the **minor version** is incremented: `1.2.3 -> 1.3.0`
1. If there was **no API break** and **no new feature** was added, the **patch version** is incremented: `1.2.3 -> 1.2.4`
   - e.g. when _only_ defects were fixed

## 6 Contributing

Please read the [contribution guidelines](CONTRIBUTING.md) for this repository and keep our [code of conduct](CODE_OF_CONDUCT.md) in mind.
