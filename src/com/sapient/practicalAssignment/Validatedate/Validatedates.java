package com.sapient.practicalAssignment.Validatedate;

import java.time.LocalDate;

public class Validatedates {
    public static void main(String[] args)
    {

        // Create LocalDate objects with dates
        //LocalDate d1 = LocalDate.of(2021, 12, 15);
        //LocalDate d2 = LocalDate.of(2021, 12, 14);

        LocalDate d1 = LocalDate.of(2021, 12, 15);
        LocalDate d2 = LocalDate.of(2021, 12, 16);


        System.out.println("Date1: " + d1);
        System.out.println("Date2: " + d2);
        if (d1.isAfter(d2)) {

            System.out.println("Date1 is after Date2");
        }

        else if (d1.isBefore(d2)) {

            System.out.println("Date1 is before Date2");
        }

        else if (d1.isEqual(d2)) {

            System.out.println("Date1 is equal to Date2");
        }
    }
}
