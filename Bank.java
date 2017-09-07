package com.company;
import java.util.Scanner;

/**
 * Created by apple on 30/05/17.
 */
public class Bank
{
    public static void main(String[] args) {
        int t;

        while(true) {

            Scanner s = new Scanner(System.in);

            System.out.println("(1) . Create Account  (2). Display ur Info(Account Holder");
            int a = s.nextInt();
            if (a == 1) {

                Customer c1 = new Customer();
                c1.enter();

            } else {

                System.out.println("Enter your Account Number");

                int ii = s.nextInt();

                for(t = 0; t < Customer.aanum.length; t++){

                if(ii == Customer.aanum[t]) {
                    System.out.println("Account Number is Valid : )");
                    System.out.println(" 1. Checking Balance ");
                    System.out.println(" 2. Deposit ");
                    int iy = s.nextInt();

                    switch(iy) {

                        case 1:
                            System.out.println("Your Balance = " + Customer.balance[t]);
                            break;
                        case 2:
                            int at = s.nextInt();
                            System.out.println("Enter the Amount you want to Deposit = " + at);
                            Customer.balance[t] = Customer.balance[t] + at;
                            System.out.println("Your new Balance = " + Customer.balance[t]);
                            break;

                    }

                }


                }
                if(t >= Customer.aanum.length )
                {
                    System.out.println("Account not exist, Create one");
                }



            }

        }



    }
}


class Customer{

    static int i;
    static int aanum[] = new int[10];
    static String names[] = new String[10];
    static int balance[] = new int[10];

    Customer(){
        i = i + 1;

    }
 void enter() {


     Scanner s3 = new Scanner(System.in);

     System.out.println("Enter ur Name");
     String cName = s3.nextLine();
     names[i] = cName;
     char c1 = names[i].charAt(0);

     System.out.println("Enter ur addharcard number");
     int aadhar = s3.nextInt();
     aanum[i] = aadhar;

     System.out.println("Enter Amount");
     int bal = s3.nextInt();
     balance[i] = bal;

     System.out.println("Account Created" + "Your Account No = " + c1 + aadhar + " with balance " + bal);


 }

}






