package org.myapp.Java_17.features.sealed_keyword;

sealed interface Shape_2 extends Cloneable permits Circle_2,Square_2,Triangle_2 {
}
non-sealed class Circle_2 implements Shape_2{
}

final class Square_2 implements Shape_2{
}

final class Triangle_2 implements Shape_2 {
}

public class DemoMain_2 {

    public static void main(String[] args) {

        System.out.println("Welcome");
    }
}
