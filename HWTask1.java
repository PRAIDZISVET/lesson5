package com.itacademy.lesson5;

import java.util.Arrays;

public class HWTask1 {
    public static void main(String[] args) {
        String line = "1asdgdsa1";

        //System.out.println(isPalindromArray(line));

        System.out.println(isPalindromBuilder(line));
    }

    private static boolean isPalindromBuilder (String line) {
        String reverseLine = new StringBuilder(line).reverse().toString();
        return line.equals(reverseLine);
    }

    private static boolean isPalindromArray (String line) {
        char [] lineArray = line.toCharArray();
        String reverseLine = "";
        for (int i = lineArray.length-1; i >= 0 ; i--) {
            reverseLine += lineArray [i];
        }
        return line.equals(reverseLine);
    }
}