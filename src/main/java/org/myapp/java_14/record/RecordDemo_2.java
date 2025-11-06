package org.myapp.java_14.record;

import java.io.Serializable;

record Students_2(int id, String name) implements Cloneable, Serializable {

    static int a;
    //int b;

    public Students_2 {
        if (id == 0)
            throw new IllegalArgumentException("Student with id 0 is not allowed");
    }
}

public class RecordDemo_2 {

    public static void main(String[] args) {

        Students_2 s1 = new Students_2(101, "uma");
        Students_2 s2 = new Students_2(101, "uma");
        System.out.println(s1.equals(s2));
    }
}
