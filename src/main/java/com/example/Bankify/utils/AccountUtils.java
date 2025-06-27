package com.example.Bankify.utils;

import java.time.Year;

public class AccountUtils {

    public static String generateAccountNumber(){
        //currentYear + randomSixDigits number
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //Generate a random number using min and max variables
        int randNumber = (int)(Math.random() * (max - min + 1) + min);

        //convert the current and randomNumber into strings, and then concatenate them
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}
