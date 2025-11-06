package org.myapp.factory.dp;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logging messages using database :"+message);
    }
}
