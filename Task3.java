package com.itacademy.lesson5;

public class Task3 {
    public static void main(String[] args) {
        String string = "Жил был у бабушки серенький козлик. Жил";
        String word = "Жил";

        System.out.println(isStringStartsEndEndsWithWord(string, word));
    }

    private static boolean isStringStartsEndEndsWithWord (String string, String word) {
 //       Boolean result = false;
 //       if (string.startsWith(word) && string.endsWith(word)) {
 //           result = true;
 //       }
 //       return result;
           return string.startsWith(word) && string.endsWith(word);
    }
}
