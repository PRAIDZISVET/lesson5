package com.itacademy.lesson5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String [] firstValue = {"first", "second", "third"};
        String [] secondValue = {"third", "second", "first"};

        System.out.println(isArrasEqual(firstValue, secondValue));

    }

    private static boolean isArrasEqual (String [] firstValue, String [] secondValue) {
        boolean result = true;

        if (firstValue.length != secondValue.length) {
            result = false;
        } else {
            Arrays.sort(firstValue);
            Arrays.sort(secondValue);
            // Arrays.equals(firstValue, secondValue);      // метод, сравнивает массивы
            for (int i = 0; i < firstValue.length; i++) {
                if (!firstValue [i].equals(secondValue [i])) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
