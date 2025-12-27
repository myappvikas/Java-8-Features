package org.myapp.java_8.features.custome_functional_interface;

public class PredicateDemo {

    public static void main(String[] args)
    {
        MyPredicate<Integer> myPredicate = i -> i % 2 == 0;
        System.out.println(myPredicate.test(15));
    }
}
@FunctionalInterface
interface MyPredicate<T>
{
    boolean test(T t);
}
