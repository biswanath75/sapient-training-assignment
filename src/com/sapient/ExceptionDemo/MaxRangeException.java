package com.sapient.ExceptionDemo;

public class MaxRangeException extends Exception {

    private  int deatils;
    public MaxRangeException(int deatils){
        this.deatils=deatils;

    }

    @Override
    public String toString() {
        return "MaxRangeException{" +
                "deatils=" + deatils +
                '}';
    }
}
