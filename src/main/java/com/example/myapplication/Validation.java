package com.example.myapplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String USERNAME_REGEX_PATTERN = "^[a-zA-z]{3,20}$";

    public static boolean isValidCredentials(String credential){
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(credential);

        return  matcher.find();
    }
}
