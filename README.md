# bdd-test-automation-template

A very simple template project for creating a test automation suite using java, selenium, selenide &amp; cucumber. Modify, integrate it and extend it in any way to your heart's content.

### Selenide

The project uses [Selenide](https://selenide.org/documentation/selenide-vs-selenium.html), a wrapper around Selenium which has several benefits over using Selenium alone.

### Page Object Model

A starter implementation of the page object model lives within the project. For further information read the following [article](https://medium.com/@suewild2008/page-object-model-using-selenium-d3a9bcfda84b).

## Dependencies

 ### ChromeDriver

You must download chrome drivers for your [specific OS](https://chromedriver.storage.googleapis.com/index.html?path=2.45/) and unpack them into a directory called `drivers` within the project's main directory.

### An actual running web app

This template was created to demonstrate BDD principles which advocates writing tests first before any development. As such you should use this template to build your own application.

## Running the Test Suite

In the project directory run `mvn test`. The suite will attempt to run against a web-app deployed on `http://localhost:8080/` by default. This can be overridden at run-time by specifying a system property `-DBASE_WEB_APP_URL=` or modifying the `getBaseAppUrl()` method in `BaseStepDefinition`
