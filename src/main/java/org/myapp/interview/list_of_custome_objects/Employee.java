package org.myapp.interview.list_of_custome_objects;
public record Employee(
        int empId,
        String empName,
        int deptId,
        String deptName,
        String status,
        Double salary
) {}
