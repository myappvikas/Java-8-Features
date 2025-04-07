package org.myapp.solid.principls.single_Responsibility_principle;

class EmployeeReportGenerator {
    public void generate(Employee emp) {
        System.out.println("Generating report for employee: " + emp.getName());
    }
}
