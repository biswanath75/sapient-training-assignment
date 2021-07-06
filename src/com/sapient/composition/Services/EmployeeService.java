package com.sapient.composition.Services;

import com.sapient.composition.models.Adress;
import com.sapient.composition.models.Employee;

import java.sql.SQLOutput;

public class EmployeeService {

    private Employee employee;
    private Adress adress;
    public void create(int employeeId,String name,String city,String country,String AdressLine){
        employee = new Employee(employeeId,name,new Adress(AdressLine,city,country));
        System.out.println("++++++Employee CReated +++++++");

    }
    public void displayEmployeeDetails(){
        employee.printEmployee();
    }




}
