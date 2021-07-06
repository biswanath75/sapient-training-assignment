package com.sapient.composition.models;

public class Employee {
    private int employeeId;
    private String name;
    private Adress adress;

    public Employee() {
    }

    public Employee(int employeeId, String name, Adress adress) {
        this.employeeId = employeeId;
        this.name = name;
        this.adress = adress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void printEmployee(){
        System.out.println("EmployeeInfo => ");
        System.out.println("ID ::"+employeeId);
        System.out.println("NAME ::"+name);
        System.out.println("ADRESS => ");
        adress.printAdress();

    }
}
