WebDriver Extension Archetype Quickstart
===================

An quickstart archetype for new WebDriver Extension projects.

### How to Use It

#### Create the Project
Use the maven archetype generate command to create a new project 
```sh
mvn archetype:generate                                                                             \
  -DgroupId=your.group.id                                                                        \
  -DartifactId=your-artifact-id                                                                    \
  -Dversion=your-artifact-version                                                                  \
  -DsiteName=YourWebSiteNameInUpperCamelCase                                                       \
  -DsiteUrl=https://yourwebsiteurl.com                                                             \
  -DarchetypeGroupId=org.andidev                                                                   \
  -DarchetypeArtifactId=webdriver-extension-archetype-quickstart                                   \
  -DarchetypeVersion=1.0-SNAPSHOT                                                                  \
  -DarchetypeCatalog=https://oss.sonatype.org/content/repositories/snapshots/archetype-catalog.xml
```

E.g. lets say we want to create the a project to test the GitHub website

```sh
mvn archetype:generate                                                                             \
  -DgroupId=com.github                                                                             \
  -DartifactId=github                                                                              \
  -Dversion=1.0-SNAPSHOT                                                                           \
  -DsiteName=GitHub                                                                                \
  -DsiteUrl=https://github.com                                                                     \
  -DarchetypeGroupId=org.andidev                                                                   \
  -DarchetypeArtifactId=webdriver-extension-archetype-quickstart                                   \
  -DarchetypeVersion=1.0-SNAPSHOT                                                                  \
  -DarchetypeCatalog=https://oss.sonatype.org/content/repositories/snapshots/archetype-catalog.xml
```

#### Adding the Drivers
You could eihter download the latest drivers provided by an arhcetype
```sh
mvn archetype:generate                                                                             \
  -DarchetypeGroupId=org.andidev                                                                   \
  -DarchetypeArtifactId=webdriver-extension-archetype-drivers                                      \
  -DarchetypeVersion=1.0-SNAPSHOT                                                                  \
  -DarchetypeCatalog=https://oss.sonatype.org/content/repositories/snapshots/archetype-catalog.xml
```
... or add them manually to the following folders renamed to the names shown below
```
your-artifact-id
├── drivers
│   ├── linux
│   │   └── chromedriver
│   ├── mac
│   │   └── chromedriver
│   └── windows
│       ├── chromedriver.exe
│       └── internetexplorerdriver.exe
```
Note that it is only nessecery to add drivers for platforms that will be used. E.g. just skip adding the linux and the mac folders and drivers if you will only run your test on windows.

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
