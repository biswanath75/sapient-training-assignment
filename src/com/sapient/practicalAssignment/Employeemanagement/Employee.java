package com.sapient.practicalAssignment.Employeemanagement;

public class Employee {

    public long empid;
    public String empName;
    public double empSal;

    public Employee() {}

    public Employee(long empid, String empName, double empSal) {
        this.empid = empid;
        this.empName = empName;
        this.empSal = empSal;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public long getEmpid() {
        return empid;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSal() {
        return empSal;
    }
}
