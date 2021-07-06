package com.sapient.practicalAssignment.Employeemanagement;



public class Accountant {

    private Employee employee;

    public String bankName;
    public  int companyAccountNumber;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCompanyAccountNumber(int companyAccountNumber) {
        this.companyAccountNumber = companyAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public int getCompanyAccountNumber() {
        return companyAccountNumber;
    }
}
