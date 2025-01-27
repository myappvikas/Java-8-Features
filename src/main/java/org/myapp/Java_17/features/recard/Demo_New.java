package org.myapp.Java_17.features.recard;

record Students(int id,String name){}

public class Demo_New {

    public static void main(String[] args) {

        Students s1 = new Students(101,"uma");
        Students s2 = new Students(101,"uma");
        System.out.println(s1.equals(s2));
        System.out.println(s1);
    }
}
