package org.myapp.core.java.immutable;

public final class Person {

    private final String name;
    private final int age;
    private final Address address; // Assuming Address is a mutable object

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Defensive copy of mutable object
        this.address = new Address(address);
    }

    public String getName() {
        return name;
    }
    public int getAge() { return age;
    }
    // Return a copy, not the original reference
    public Address getAddress() {
        return new Address(address);
    }
}
