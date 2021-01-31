package com.itacademy.lesson5;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String inputValue = "1234567890134";
        System.out.println(Arrays.toString(splitByCharsNumber(inputValue, 3)));
    }

    private static String [] splitByCharsNumber(String value, int n) {
       int newArrayLength = (int) (Math.ceil((double) value.length()/n));
        String [] result = new String [newArrayLength];
        String temp = "";
        for (int i = 0; i < value.length(); i++) {
            temp += value.charAt(i);
            if ((i+1) % n == 0) {
                result [(i+1)/n-1] = temp;
                temp = "";
            }
        }
        if (!temp.equals("")) {
            result [result.length-1] = temp;
        }
        return result;
    }
}
