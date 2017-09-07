package com.company;


import java.util.Scanner;

public class ToggleString {

    public static String toggleCase(String inputString) {

        String result = "";

        for (int i = 0; i < inputString.length(); i++) {
            char s1 = inputString.charAt(i);
            if (Character.isUpperCase(s1)) {
                s1 = Character.toLowerCase(s1);
                result = result + s1;

            } else {
                s1 = Character.toUpperCase(s1);
                result = result + s1;

            }
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        System.out.println(toggleCase(inputString));

    }
}



