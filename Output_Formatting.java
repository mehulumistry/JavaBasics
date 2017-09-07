package com.company;
import java.util.*;

public class Output_Formatting {

    public static void main(String[] args) {



        int i = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        while (i < 3)
        {
            String s1 = sc.next();
            int t = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, t);
            i++;
        }
        System.out.println("================================");
    }
}






