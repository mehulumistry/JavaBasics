package com.company;
import java.util.Scanner;


class Main {
    public static void main(String args[] ) throws Exception {


        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        String name = s.next();
        System.out.println(N);
        System.out.println(name);
        s.close();

    }
}
