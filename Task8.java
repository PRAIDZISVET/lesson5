package com.itacademy.lesson5;

public class Task8 {
    public static void main(String[] args) {
        String sentence = "one two  three   four";

        System.out.println(numberOfWords(sentence));
    }

    private static int numberOfWords (String value) {
        int result = 0;
        char space = ' ';
        char [] sentenceArray = value.toCharArray();
        for (int i = 0; i < sentenceArray.length; i++) {
            if (i == 0) {

            }
            if (sentenceArray [i] == space && sentenceArray [i+1] != space) {
                result++;
            }
        }

        return result;
    }
}
