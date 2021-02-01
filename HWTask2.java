package com.itacademy.lesson5;

import java.util.Arrays;

public class HWTask2 {
    public static void main(String[] args) {
        String numberRoman = "MCDLXXIV";

        parseRomanToArabArray(numberRoman);

        System.out.println(endArabNumber(parseRomanToArabArray(numberRoman)));
    };

    private static int endArabNumber (int [] value) {
        int result = 0;
        for (int i = 0; i < value.length ; i++) {
            if (i == value.length - 1) {
                result += value [i];
            } else
            if (value [i] < value [i+1]){
                result -= value [i];
            } else {
                result += value [i];
            }
        }
        return result;
    }


    private static int [] parseRomanToArabArray (String value) {
       // String numberArab = "";
        char [] digitRomanArray = value.toCharArray();
        int [] digitArabArray = new int [digitRomanArray.length];
        for (int i = 0; i < digitRomanArray.length; i++) {
            switch (digitRomanArray [i]) {
                case 'M':
                    digitArabArray [i] = 1000;
                    break;
                case 'D':
                    digitArabArray [i] = 500;
                    break;
                case 'C':
                    digitArabArray [i] = 100;
                    break;
                case 'L':
                    digitArabArray [i] = 50;
                    break;
                case 'X':
                    digitArabArray [i] = 10;
                    break;
                case 'V':
                    digitArabArray [i] = 5;
                    break;
                case 'I':
                    digitArabArray [i] = 1;
                    break;
            }
        }
        return digitArabArray;
    }
}
