package com.itacademy.lesson5;

public class Task9 {
    public static void main(String[] args) {
        String sameLetters = "aaarrrrrrrrrrrrbbceeeeeeeeeeedeehhhhhhhhhhhhhhf,,,,,,,,,";
        System.out.println(oneLetter(sameLetters));
    }

    private static String oneLetter (String value) {
        StringBuilder result = new StringBuilder();
        char [] sameLettersAray = value.toCharArray();
        for (int i = 0; i < sameLettersAray.length; i++) {
            if (i == sameLettersAray.length - 1) {
                result.append(sameLettersAray [i]);
            } else
            if (sameLettersAray [i] != sameLettersAray [i+1]) {
                result.append(sameLettersAray [i]);
            }
        }
        return result.toString();
    }
}
