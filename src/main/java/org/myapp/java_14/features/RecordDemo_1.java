package org.myapp.java_14.features;

record Students(int id,String name){}

public class RecordDemo_1 {

    public static void main(String[] args) {

        Students s1 = new Students(101,"uma");
        Students s2 = new Students(101,"uma");
        System.out.println(s1.equals(s2));
        System.out.println(s1);
    }
}
