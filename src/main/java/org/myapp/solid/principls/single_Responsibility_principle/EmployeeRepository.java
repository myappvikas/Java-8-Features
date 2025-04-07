package org.myapp.solid.principls.single_Responsibility_principle;

class EmployeeRepository {

    public void save(Employee emp) {
        System.out.println("Saving employee to database: " + emp.getName());
    }
}