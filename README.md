# Maven Selenium TestNG

The Maven Selenium TestNG template project.

# Preconditions

1. Install JAVA;
2. Add java path to JAVA_HOME;
3. Install Maven;
4. Add maven path to MAVEN_HOME;
5. Install any code editor.

# Steps to run

Run the command below

```
mvn test
```

# Report

The report is generated in the file `target/surefire-reports/index.html`.

# CI

Testing runs daily at 6am in GitHub actions and deploys a report in the [report](https://github.com/Luxe-Quality/maven-selenium-testng/tree/report) branch.

Report link: https://luxe-quality.github.io/maven-selenium-testng/
