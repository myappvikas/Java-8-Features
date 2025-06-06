package org.myapp.main.test;

import java.util.List;

public record Customer(int id, String name, int age, List<String> strings){

    public Customer{
        strings = List.copyOf(strings);
    }
}

