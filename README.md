WebDriver Extension Archetype Quickstart
===================

A quickstart archetype for new WebDriver Extension projects.

### Requirements
- Java 6 or higher
- Maven 3.x.x

### Creating a New Project
Open your terminal and run the following command from where you want to create your project
```sh
mvn archetype:generate -DarchetypeGroupId=com.github.webdriverextensions -DarchetypeArtifactId=webdriverextensions-archetype-quickstart
```

Maven then asks you for your project's
- [groupId](http://maven.apache.org/guides/mini/guide-naming-conventions.html)     (e.g. com.companyname)
- [artifactId](http://maven.apache.org/guides/mini/guide-naming-conventions.html)  (e.g. sitenametests)
- [version](http://maven.apache.org/guides/mini/guide-naming-conventions.html)     (e.g. 1.0-SNAPSHOT)
- [package](http://maven.apache.org/guides/mini/guide-naming-conventions.html)     (e.g. com.companyname)

...and lastly your website's
- siteName   (in CamelCased form, e.g. SiteName)
- siteUrl    (starting with http:// or https//, e.g. http://www.siteurl.com)

Confirm the configuration and let Maven generate the following project for you
```
sitenametests
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

Simply just run the generated template test by executing

```sh
cd sitenametests
mvn test
```

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
