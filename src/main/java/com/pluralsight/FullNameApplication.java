package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        String fullName;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("what is your first name? ");
        String firstName = myScanner.nextLine();

        System.out.println("what is your middle name? ");
        String middleName = myScanner.nextLine();

        System.out.println("what is your last name? ");
        String lastName = myScanner.nextLine();

        System.out.println("your full name is: " + firstName + " " +  middleName + " " + lastName);
    }
}
