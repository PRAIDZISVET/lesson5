package com.itacademy.lesson5;

public class Test {
    public static void main(String[] args) {
        String firstValue = "abcd";
       // String secondValue = new String("abcd"); // такой вариант нельзя использовать, т. к. лишний раз выделяется память !!!
        // String secondValue = new String("abcd").intern ();     // тогда также ссылается на один объект.
        //                                                              допустимо, но лучше не использовать

        String secondValue = "abcd"; // ссылка на один и тот же объект "abcd"
        System.out.println(firstValue == secondValue); // сравниваем по ссылке
    }
}
