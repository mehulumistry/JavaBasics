package com.company;
import java.util.*;
import java.math.*;
/**
 * Created by apple on 8/29/17.
 */
public class Java_Loops {


    public static void main(String[] args) {

    int h = 0;
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

        for(int j = 0; j < n ; j++){

            h = (int) (a + (Math.pow(2,j))*b + h);
            System.out.print(h + " ");

        }
    }
        in.close();
  }
}

