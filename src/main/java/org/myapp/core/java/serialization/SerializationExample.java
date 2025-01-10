package org.myapp.core.java.serialization;

import java.io.*;

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L; // Required for versioning

    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Serialization
        MyClass obj = new MyClass("John", 30);
        String filename = "object.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        MyClass newObj = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            newObj = (MyClass) in.readObject();
            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print deserialized object
        if (newObj != null) {
            System.out.println("Deserialized Object: " + newObj);
        }
    }
}
