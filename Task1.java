package com.itacademy.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
//        simpleString();
//        simpleStringBuilder();
//        test();
        String firstValue = "aab,fhhfj,fhyj,yrryju,ryu";
        String secondValue = "bab";
        System.out.println(Arrays.toString(firstValue.split(",")));
    }

    private static void test() {
        StringBuffer stringBuilder = new StringBuffer()
                .append("first")
                .append("second")
                .append("third");

        System.out.println(stringBuilder.toString());
    }


    private static void simpleString() {
        Random random = new Random();
        int countRandomValues = 10_000;
        String result = "";
        long start = System.nanoTime();

        for (int i = 0; i < countRandomValues; i++) {
            result += random.nextInt(1000000);
        }
        long end = System.nanoTime();
        System.out.println("Время выполнения: " + (end - start));
    }
    private static void simpleStringBuilder () {
        Random random = new Random();
        int countRandomValues = 10_000;
        StringBuilder result = new StringBuilder();
        long start = System.nanoTime();

        for (int i = 0; i < countRandomValues; i++) {
            result.append(random.nextInt(1000000));
        }
        String resultString = result.toString();
        long end = System.nanoTime();
        System.out.println("Время выполнения: " + (end - start));
    }
}
