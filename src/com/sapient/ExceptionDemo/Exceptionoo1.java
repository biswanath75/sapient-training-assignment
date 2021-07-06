package com.sapient.ExceptionDemo;

import java.util.Scanner;

public class Exceptionoo1 {
    private static void calculateFactorial(int num){
        int fact=1;
        for (int i=1;i<= num;i++){
            fact*=i;

        }
        System.out.println("factorial of num is "+fact);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num =Integer.parseInt(sc.nextLine());
        calculateFactorial(num);
        sc.close();
    }

}
