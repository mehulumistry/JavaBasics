package com.company;

/**
 * Created by apple on 29/05/17.
 */
public class Add {

    public static void main(String[] args) {

        Alu al = new Alu();
        Slu sl = new Slu();
        System.out.println(Slu.a);
        sl.sub(10,8);
        System.out.println(Slu.a);
        al.alu(13,14);
        al.alu(1.2,1.2);

    }

}


class Alu{

    int a,b;

    Alu(){
        a = 10;
        b = 15;

    }
    void alu(int a,int b){
       int c = a+b;
        System.out.println(c);
    }

    void alu(double a,double b){
        double c = this.a+this.b;
        System.out.println(c);
    }
}

class Slu{

    static int a,b;

    void sub(int a,int b){
        this.a = a;
        this.b = b;
        int c = a-b;
        System.out.println(c);
    }
}
