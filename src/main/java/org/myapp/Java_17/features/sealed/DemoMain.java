package org.myapp.Java_17.features.sealed;

sealed class A extends Thread implements Cloneable permits B,C{

}
non-sealed class B extends A{

}
final class C extends A{

}
class D extends B {

}

//sealed interface M permits N{}

//sealed interface N extends M{}

public class DemoMain {

    public static void main(String[] args) {

        System.out.println("Welcome");
    }
}
