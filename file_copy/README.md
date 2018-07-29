


mvn clean compile 

mvn exec:java -Dexec.mainClass=com.jai.examples.file_copy.App

(Run it from location where POM.xml present)
G:\backup\Development\Java\workspace-sts-3.9.2.RELEASE\CamelTutorials\file_copy>mvn exec:java -Dexec.mainClass=com.jai.file_copy.examples.App

mvn clean compile assembly:single

(Run it from location where jar file is present)
java -jar file_copy-0.0.1-SNAPSHOT-jar-with-dependencies.jar