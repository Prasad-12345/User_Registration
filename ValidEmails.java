package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Author: Prasad
 * Test the added email samples are valid or invalid
 */
public class ValidEmails {
    public static void main(String[] args) {
        //created array list
        ArrayList<String> email = new ArrayList<>();
        System.out.println("-----Valid emails-----");
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");
        System.out.println("-----Invalid emails-----");
        email.add("abc");
        email.add("abc..");
        email.add("abc..@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc..@gmail.com");
        email.add("abc@gmail.com.aa.au");

        //Pattern for Emails
        String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        Pattern pattern = Pattern.compile(reGex);
        //Checking each email for gievn pattern
        for (String str : email) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("vaild email: " + str + " :" + matcher.matches());
            } else {
                System.out.println("Invaild email: " + str + " :" + matcher.matches());
            }
        }
    }
}