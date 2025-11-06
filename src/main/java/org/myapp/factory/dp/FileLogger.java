package org.myapp.factory.dp;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logging messages using file: "+message);
    }
}
