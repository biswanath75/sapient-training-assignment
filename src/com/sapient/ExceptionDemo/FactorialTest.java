package com.sapient.ExceptionDemo;


import java.util.Scanner;

public class FactorialTest {

    private static void calculatefactorial(int number) throws MaxRangeException,MinrangeException{
        int fact =1;
        if (number<1){
            throw new MinrangeException(number);
        }if(number>7){
            throw new MaxRangeException(number);
        }
        for (int i=1;i<= number;i++){
            fact*= i;
            fact*= i;

        }
        System.out.println("Factorial of "+number+"is"+fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =Integer.parseInt(sc.nextLine());
        try {
            calculatefactorial(num);
        }catch (MaxRangeException e){
            System.out.println(e);
            e.printStackTrace();
        }catch (MinrangeException e){
            System.out.println(e);
            e.printStackTrace();
        }finally {
            sc.close();
            System.out.println("Resources cleaned Up");
        }
    }
}
