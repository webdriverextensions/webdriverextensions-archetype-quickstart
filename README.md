WebDriver Extension Archetype Quickstart
===================

A quickstart archetype for new WebDriver Extension projects.

### Requirements
- Java 6 or higher
- Maven 3.x.x

### Creating a New Project
Open your terminal and run the following command from the direcotory where you want to create your project
```sh
mvn archetype:generate                                                                             \
  -DgroupId=your.group.id                                                                          \
  -DartifactId=your-artifact-id                                                                    \
  -Dversion=1.0-SNAPSHOT                                                                           \
  -DsiteName=YourWebSiteNameInUpperCamelCase                                                       \
  -DsiteUrl=https://yourwebsiteurl.com                                                             \
  -DarchetypeGroupId=com.github.webdriverextensions                                                \
  -DarchetypeArtifactId=webdriverextensions-archetype-quickstart                                   \
  -DarchetypeVersion=1.0
```

E.g. lets say we want to create the a project to test the GitHub website

```sh
mvn archetype:generate                                                                             \
  -DgroupId=com.github                                                                             \
  -DartifactId=github                                                                              \
  -Dversion=1.0-SNAPSHOT                                                                           \
  -DsiteName=GitHub                                                                                \
  -DsiteUrl=https://github.com                                                                     \
  -DarchetypeGroupId=com.github.webdriverextensions                                                \
  -DarchetypeArtifactId=webdriverextensions-archetype-quickstart                                   \
  -DarchetypeVersion=1.0
```

No need to add any drivers since the webdriverextensions-maven-plugin is configured to download
them for you!

Simply just run the generated template test by executing

```sh
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
