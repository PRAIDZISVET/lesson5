package com.itacademy.lesson5;

public class Task4 {
    public static void main(String[] args) {
        String firstName = "petr";
        String secondName = "Ivanov";
        String paronicName = "sergeevich";

        System.out.println(getFio3(firstName,secondName,paronicName));
    }

    private static String getFio (String firstName, String secondName, String patronicName) {
        char firstValue = getFirstChar(firstName);
        char secondValue = getFirstChar(secondName);
        char patronicValue = getFirstChar(patronicName);

        return (firstValue + "." + patronicValue + "." + secondValue + ".").toUpperCase();

    }

    private static String getFio2 (String firstName, String secondName, String patronicName) {
        char firstValue = getFirstChar(firstName);
        char secondValue = getFirstChar(secondName);
        char patronicValue = getFirstChar(patronicName);

        return (getFirstChar(firstName) + "." + getFirstChar(patronicName) + "." + getFirstChar(secondName) + ".").toUpperCase();

    }

    private static String getFio3 (String firstName, String secondName, String patronicName) {
       return new StringBuilder ()
                .append(getFirstChar(firstName))
                .append(".")
                .append(getFirstChar(patronicName))
                .append(".")
                .append(getFirstChar(secondName))
                .append(".")
                .toString()
                .toUpperCase();
    }

    private static char getFirstChar(String firstName) {

        return firstName.charAt(0);
    }
}
