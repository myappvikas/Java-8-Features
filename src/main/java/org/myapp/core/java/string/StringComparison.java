package org.myapp.core.java.string;

public class StringComparison {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "vikas", 1000d);
        Employee e2 = new Employee(1, "vikas", 1000d);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));

        String s1 = "uma";
        String s2 = "uma";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = new String("varanasi");
        String s4 = new String("varanasi");

        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
    }
}
