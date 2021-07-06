package com.sapient.composition.Test;

import com.sapient.composition.Services.EmployeeService;

public class TestEmployee {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.create(100,"Biswanath","bangalore","India","Marathali");
        service.displayEmployeeDetails();
    }
}
