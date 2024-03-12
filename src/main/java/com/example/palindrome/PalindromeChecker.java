package com.example.palindrome;

public class PalindromeChecker {

    public static boolean isPalindrome(String simplifyString){
        final String simplifyiedString= simplifyString(simplifyString);
        final String reversedString =new StringBuilder(simplifyiedString)
                .reverse().toString();

        return simplifyiedString.equals(reversedString);
    }

    public static String simplifyString(String simplify){
        return simplify.toLowerCase()
                .replaceAll("[^a-z)0-9]","");



    }
}
