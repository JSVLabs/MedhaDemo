# MedhaDemo

Step 1: Clone this repository
Step 2: Download MedhaUtilities.jar from https://github.com/JSVLabs/MedhaUtilities/tree/main/out/artifacts/MedhaUtilities_jar
Step 3: Install jar file using the command mvn install:install-file -Dfile=<Jarfilepath>/MedhaUtilities.jar -DgroupId=Medha -DartifactId=MedhaUtilities -Dversion=1.0 -Dpackaging=jar
Step 4: Run command  mvn exec:java -Dexec.mainClass=ExecuteTest -Dexec.args="<testid> QA chrome"
example:  mvn exec:java -Dexec.mainClass=ExecuteTest -Dexec.args="3zmsrcyqy QA chrome"



