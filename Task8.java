package com.itacademy.lesson5;

public class Task8 {
    public static void main(String[] args) {
        String sentence = " one two  three   four    five     six senen 8 9        ten       ";
        System.out.println(numberOfWords(sentence));
    }

    private static int numberOfWords (String value) {
        int result = 1;
        char space = ' ';
        char [] sentenceArray = value.trim().toCharArray();
        for (int i = 1; i < sentenceArray.length-1; i++) {
            if (sentenceArray [i] == space && sentenceArray [i+1] != space) {
                result++;
            }
        }
        return result;
    }
}
