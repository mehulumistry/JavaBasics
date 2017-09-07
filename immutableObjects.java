/**
 * Created by apple on 9/1/17.
 */




final class Test{

    int i;


    Test(int i){

       this.i = i;


    }


    public Test modify(int i){

        if(this.i == i){
            return this; // means return the reference of this Object;
        }
        else{
            return new Test(i);
        }

    }


}
public class immutableObjects {

    public static void main(String[] args) {

        Test t1 = new Test(10);
        Test t2 = t1.modify(100);

    }

}
