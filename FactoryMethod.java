package com.company;

/**
 * Created by apple on 03/07/17.
 */

class Test{

    public static Test t = new Test();
    public static Test getTest(){
        return t;

    }
}

public class FactoryMethod {

    public static void main(String[] args) {

        Test t1 = Test.getTest();
        Test t2 = Test.getTest();
        System.out.println(t1);
        System.out.println(t2);

    }

}


