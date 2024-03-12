package com.example.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_StringProvided_true() {
        //given
        final String str="R00000      r ------";
        //when
        final boolean result= PalindromeChecker.isPalindrome(str);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    void isPalindrome_StringProvided_false() {
        //given
        final String str="R00000      r ------";
        //when
        final boolean result= PalindromeChecker.isPalindrome(str);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void simplifyString() {
        //given
        final String str="R00000      r ------";
        //when
        final String result= PalindromeChecker.simplifyString(str);
        //then
        Assertions.assertEquals("r00000r",result);
    }
}