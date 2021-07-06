package com.sapient.ExceptionDemo;

public class MinrangeException  extends Exception {
    private int deatils;

    public MinrangeException(int deatils) {
        this.deatils = deatils;
    }

    @Override
    public String toString() {
        return "Minrangeexceed["+deatils+"]";
    }
}
