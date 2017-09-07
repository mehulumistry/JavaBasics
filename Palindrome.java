package com.company;
import java.util.Scanner;
/**
 * Created by apple on 30/05/17.
 */



class Palindrome{
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();

        for(int i = 0;i < inputString.length()/2;i++){
            char c = inputString.charAt(i);
            char ce = inputString.charAt(inputString.length() - 1 - i);
            if (c == ce){
                if(i == inputString.length()/2 - 1)
                {
                    System.out.println("YES");
                }

            }
            else {
                System.out.println("NO");
                break;
            }
        }

    }
}