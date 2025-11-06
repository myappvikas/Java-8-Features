package org.myapp.solid.principls.single_responsibility_principle;

public class EmployeeClassWithViolationOfSRP {

    private int id;
    private int name;

    //getters and setters

    public void saveEmployeeIntoDatabase() {
        // code to save employee data to DB
    }

    public void generateReport() {
        // code to generate employee report
    }
}
