package org.myapp.core.java.serialization;

import java.io.*;

public class TransientDemo {

    public static void main(String[] args) {

        // Serialization
        MyClass_1 obj = new MyClass_1("vikas", 35);
        String filename = "object.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        MyClass_1 newObj = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            newObj = (MyClass_1) in.readObject();
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

class MyClass_1 implements Serializable {

    private static final long serialVersionUID = 1L; // Required for versioning

    private transient String name;

    private transient static int age;

    public MyClass_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}