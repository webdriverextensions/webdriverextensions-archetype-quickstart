[![Build Status](https://travis-ci.org/webdriverextensions/webdriverextensions-archetype-quickstart.svg?branch=master)](https://travis-ci.org/webdriverextensions/webdriverextensions-archetype-quickstart)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.webdriverextensions/webdriverextensions-archetype-quickstart.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3Acom.github.webdriverextensions)

WebDriver Extension Archetype Quickstart
===================

A quickstart archetype for new WebDriver Extension projects.

### Requirements
- Java 7 or higher
- Maven 3 or higher

### Creating a New Project
##### Open your terminal and run the following command
```sh
mvn archetype:generate -DarchetypeGroupId=com.github.webdriverextensions -DarchetypeArtifactId=webdriverextensions-archetype-quickstart
```

##### Maven then asks you for your project's
- [groupId](http://maven.apache.org/guides/mini/guide-naming-conventions.html)     (e.g. com.companyname)
- [artifactId](http://maven.apache.org/guides/mini/guide-naming-conventions.html)  (e.g. projectname)
- [version](http://maven.apache.org/guides/mini/guide-naming-conventions.html)     (e.g. 1.0-SNAPSHOT)
- [package](http://maven.apache.org/guides/mini/guide-naming-conventions.html)     (e.g. com.companyname)

##### ...and lastly your website's
- siteName   (in CamelCased form, e.g. SiteName)
- siteUrl    (starting with http:// or https//, e.g. http://www.siteurl.com)

##### Confirm the configuration and let Maven generate the following project for you
```
projectname
├── drivers
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── companyname
    │               ├── SiteNameSite.java
    │               ├── SiteNameSiteTest.java
    │               ├── component
    │               │   └── ExampleWebComponent.java
    │               └── page
    │                   └── MainPage.java
    └── test
        ├── java
        │   └── com
        │       └── companyname
        │           └── MainPageTest.java
        └── resources
            └── logback-test.xml
```

No need to add any drivers since the webdriverextensions-maven-plugin is configured to download
them for you!

##### Simply just run the generated template test by executing

```sh
cd projectname
mvn test
```

### Changelog

#### 2.0.0 (2015 Sep 20)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 2.0.0
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions-maven-plugin version to 2.0.0
- JAVA 7 REQUIREMENT Now compiled with java 7 as target since selenium already does that since the 2.47.0 version

#### 1.8.0 (2015 Sep 9)
- SELENIUM DRIVER UPDATE Updated chrome driver to 2.19

#### 1.7.0 (2015 Aug 11)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 1.7.0
- SELENIUM DRIVER UPDATE Updated internetexplorer driver to 2.47

#### 1.6.0 (2015 June 9)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 1.6.0
- SELENIUM DRIVER UPDATE Updated internetexplorer driver to 2.46 and chromedriver to 2.16

#### 1.5.0 (2015 May 12)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 1.5.0
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions-maven-plugin version to 1.1.0
- SELENIUM DRIVER UPDATE Updated chrome driver to 2.15

#### 1.4.0 (2015 Mars 23)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 1.4.0

#### 1.3.0 (2015 Mars 12)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 1.3.0
- SELENIUM DRIVER UPDATE Updated internetexplorer driver to 2.45 and chromedriver to 2.14

#### 1.2.0 (2014 October 29)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 1.2.0
- SELENIUM DRIVER UPDATE Updated internetexplorer driver to 2.44 and chromedriver to 2.12

#### 1.1.0 (2014 October 15)
- WEBDRIVEREXTENSIONS UPDATE Updated to latest webdriverextensions version to 1.1.0
- SELENIUM DRIVER UPDATE Updated internetexplorer driver to 2.43

#### 1.0.2 (2014 September 14)
- BUGFIX Fixed incorrect package issue

#### 1.0.1 (2014 September 4)
- BUGFIX Added specific driver versions to webdriverextensions-maven-plugin configuration


#### 1.0.0 (2014 September 4)
- Initial release!

## License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this work except in compliance with the License.
You may obtain a copy of the License in the LICENSE file, or at:

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
