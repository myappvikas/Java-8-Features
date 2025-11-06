package org.myapp.factory.dp;

public class LoggerFactory {

    private LoggerFactory(){}

    public static Logger getLogger(String logType) {
        if(logType == null || logType.isBlank())
            throw new IllegalArgumentException("Given string is null or blank");
        switch (logType.toLowerCase()) {
            case "file": return new FileLogger();
            case "db": return new DatabaseLogger();
            case "console": return new ConsoleLogger();
            default: throw new IllegalArgumentException("Unknown Logger type");
            }
    }
}
