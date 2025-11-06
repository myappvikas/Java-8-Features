package org.myapp.Java_17.features.sealed_keyword;

sealed class Shape extends Thread implements Cloneable permits Circle,Square,Triangle {
}
non-sealed class Square extends Shape{
}

final class Triangle extends Shape{
}

final class Circle extends Shape {

}

public class DemoMain {

    public static void main(String[] args) {

        System.out.println("Welcome");
    }
}
