package org.myapp.Java_17.features.recard;

record Students_2(int id, String name) implements Cloneable{

    static int a;
    //int b;

    public Students_2{
        if(id==0)
            throw new IllegalArgumentException("Student with id 0 is not allowed");
    }
}

public class Demo_New_2 {

    public static void main(String[] args) {

        Students_2 s1 = new Students_2(101,"uma");
        Students_2 s2 = new Students_2(101,"uma");
        System.out.println(s1.equals(s2));
        System.out.println(s1);

        System.out.println(s1.name());
    }
}
