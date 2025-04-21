package org.myapp.solid.principls.single_responsibility_principle;

public class SRPDemo {
    public static void main(String[] args) {

        Employee emp = new Employee("Vikas", 101);

        EmployeeRepository repo = new EmployeeRepository();
        repo.save(emp);

        EmployeeReportGenerator reportGen = new EmployeeReportGenerator();
        reportGen.generate(emp);
    }
}
