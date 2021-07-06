package com.sapient.practicalAssignment.GBank;


import java.util.*;
public class Bank {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        double P,n,A;
        System.out.print("Enter Principle Amount : ");
        P = Sc.nextDouble();
        System.out.print("Enter Time Period in years : ");
        n = Sc.nextDouble();
        if(P<2000.0 && n>=2.0)
        {
            A = P*Math.pow((1.0+5.0/100.0),n);
            System.out.print("Amount = "+A);

        }

        else if(P>=2000.0 && P<6000.0 && n>=2.0)

        {

            A = P*Math.pow((1.0+7.0/100.0),n);

            System.out.print("Amount = "+A);

        }

        else if(P>=6000.0 && n>=1.0)

        {

            A = P*Math.pow((1.0+10.0/100.0),n);

            System.out.print("Amount = "+A);

        }

        else if(n>=5.0)

        {

            A = P*Math.pow((1.0+10.0/100.0),n);

            System.out.print("Amount = "+A);

        }

        else

        {

            A = P*Math.pow((1.0+3.0/100.0),n);

            System.out.print("Amount = "+A);

        }

    }

}
