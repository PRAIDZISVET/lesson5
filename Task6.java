package com.itacademy.lesson5;

public class Task6 {
    public static void main(String[] args) {
        String inputValue = "asdf.asd,,asdf,asdf!asdf!";

        System.out.println(calcSymbolsArray(inputValue));
    }

    private static int calcSymbols (String value) {
        String result = value.replace(".", "");
        result = result.replace(",", "");
        result = result.replace("!", "");
        return value.length() - result.length();
    }

    private static int calcSymbolsRegex (String value) {
        return value.length() - value.replaceAll("[.,!]", "").length();
    }

    private static int calcSymbolsArray (String value) {
        String replacedValue = ".,!";
        int result = 0;
        char [] charValue = value.toCharArray();
        for (int i = 0; i < value.length(); i++) {
            char currentChar = charValue [i];
            if (replacedValue.contains(String.valueOf(currentChar))) {
                result++;
            }
        }
        return result;
    }
}
