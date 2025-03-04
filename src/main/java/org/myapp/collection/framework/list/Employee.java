package org.myapp.collection.framework.list;

public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        System.out.println("employee class hashCode()method");
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
