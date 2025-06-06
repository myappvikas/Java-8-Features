package org.myapp.core.java.serialization;

import java.io.*;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1l;

    private String name;
    //private transient String name;
    //private static transient String name;

    private Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Serialization
        Employee employee = new Employee("vikas");
        String filename = "object.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(employee);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        Employee actual = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            actual = (Employee) in.readObject();
            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Printer deserialized object
        if (actual != null) {
            System.out.println("Deserialized Object: " + actual);
        }
    }
}
