package org.myapp.solid.principls.single_responsibility_principle;

public class EmployeeClassWithViolationOfSRP {

    private String name;
    private int id;

    public void saveToDatabase() {
        // code to save employee data to DB
    }

    public void generateReport() {
        // code to generate employee report
    }
}
