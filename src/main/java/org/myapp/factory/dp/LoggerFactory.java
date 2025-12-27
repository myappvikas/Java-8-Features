package org.myapp.factory.dp;

public class LoggerFactory {

    private LoggerFactory(){}

    public static Logger getLogger(String logType) {
        if(logType == null || logType.isBlank())
            throw new IllegalArgumentException("Given string is null or blank");
        return switch (logType.toLowerCase()) {
            case "file" -> new FileLogger();
            case "db" -> new DatabaseLogger();
            case "console" -> new ConsoleLogger();
            default -> throw new IllegalArgumentException("Unknown Logger type");
        };
    }
}
