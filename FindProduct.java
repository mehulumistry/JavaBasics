package com.company;

/**
 * Created by apple on 30/05/17.
 */
import java.util.Scanner;
class FindProduct {
    public static void main(String args[] ) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int num[] = new int[N];
        int answer = 1;
        for (int i = 0; i < N; i++) {
            num[i] = s.nextInt();
            answer = (answer*num[i]) ;
        }
        System.out.println(answer);
    }
}