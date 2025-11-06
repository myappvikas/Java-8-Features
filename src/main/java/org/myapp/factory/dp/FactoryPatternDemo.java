package org.myapp.factory.dp;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        Logger fileLogger = LoggerFactory.getLogger("file");
        fileLogger.log("Logging message using file logger");

        Logger dbLogger = LoggerFactory.getLogger("db");
        dbLogger.log("Logging message using database logger");

        Logger consoleLogger = LoggerFactory.getLogger("console");
        consoleLogger.log("Logging message using console logger");
    }
}
