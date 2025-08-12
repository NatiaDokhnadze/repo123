# Swag Labs - POM & Selenide Test Automation (დავალება 17)

## პროექტის აღწერა

## ფაილების სტრუქტურა
- `src/main/java/page` - Page Object კლასები
- `src/test/java/base` - BaseTest.java
- `src/test/java/data` - UserDataProvider.java
- `src/test/java/utils` - FileHandler.java
- `src/test/java/tests` - LoginTest.java
- `src/test/resources` - testng.xml

## გაშვების ინსტრუქცია

1. Java და Maven უნდა იყოს დაყენებული
2. ტესტების გაშვება ტერმინალიდან:

```bash
mvn test -DsuiteXmlFile=src/test/resources/testng.xml
