package com.bridgelabz.regex;

import java.util.Scanner;
/*
 *Author: Prasad
 *As a user need to enter valid first name
 */
public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input first name
        System.out.println("Enter first name");
        String firstName = sc.next();
        //calling checkFirstName method
        checkFirstName(firstName);
    }

    /*
     *Entered pattern for first name
     *Check the first name is valid or not
     */
    public static void checkFirstName(String firstName){
        boolean isFirstName = firstName.matches("^[A-Z]{1}[a-z]{2,}$");

        if(isFirstName){
            System.out.println(firstName + " " + "is valid");
        }
        else{
            System.out.println("User registration is not valid");
        }
    }
}
