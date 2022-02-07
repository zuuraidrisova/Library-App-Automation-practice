NEW PROJECT/FRAMEWORK TASK
TC# 0:
Task summary:
1- Create a new project named: cybertek-library-app
if you have group id: com.cybertek
for artifact id : cybertek-library-app
2 – Click finish
3 - Select new window
4 - Create dependencies tag in pom.xml
5 - If you get enable auto-import, ENABLE it.
If not, we will enable manually.
IntelliJ --> Preferences --> search "auto import"
select: Imports
6- Add all required dependencies below: you can copy paste from older project if you
want.
• cucumber-java
• cucumber junit
• java-selenium
• webdrivermanager/bonigarcia
o (if you are not using bonigarcia you need to add drivers to your project)
• add javafaker
7- create new package under test -> java -> com.cybertek.library
8- Create new package under ‘library’ -> pages
9- Create new package under ‘library’ -> utilities
10- Create new package under ‘library’ -> runners
11- Create new package under ‘library’ -> step_definitions
12- right click on the test --> new --> directory
name: resources
13- right click on the resources --> new --> directory
name: features
14- Add plugins for “Cucumber-for java and Gherkin” (if you don’t have them)
-Mac go to Preferences --> Plugins --> Marketplace
-Search "Cucumber for Java"
-Windows go to file/settings/plugins -> marketplace
-Search "Cucumber for Java"
15- add "Cucumber for java" plug-in
16- add "Gherkin" plug-in
17- Restard IDE
18- Remove Substeps plug in (IF YOU HAVE IT)
search in installed window:
Substeps: If installed, uncheck and remove.
19- right click on runners package:
create new java class:
name : CukesRunner
20 - add @RunWith(Cucumber.class) above the class
21 - add @CucumberOptions() below @RunWith
22 - pass the path of the features directory:
right click -> copy -> copy path from CONTENT ROOT
23 - pass the path of the step_definitions package in the glue = “”
keyword value COPY FROM THE SOURCE ROOT
24 - Copy Driver utility class from previous project and paste it into new project
25 - Copy ConfigurationReader class from previous project and paste it into new
project
26 - copy configuration.properties file and paste it into new project
Note: Follow POM for any web element locating in any page.