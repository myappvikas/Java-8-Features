package org.myapp.core.java.singleton;

public class Test2 {

    private static Test2 test2 = null;

    private Test2() {
    }

    public static synchronized Test2 getTest() {
        if (test2 == null) {
            return test2 = new Test2();
        }
        return test2;
    }
}
