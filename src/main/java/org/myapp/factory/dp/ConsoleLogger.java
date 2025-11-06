package org.myapp.factory.dp;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logging messages using console: "+message);
    }
}
