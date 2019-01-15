package example2;

import example2.bean.MyObject;
import example2.component.DaggerMycomponent;
import example2.component.Mycomponent;

public class Main {



    public static void main(String[] args) {
        Mycomponent mycomponent = DaggerMycomponent.builder().build();
        MyObject myObject = mycomponent.getMyObject();
        if(myObject.classA == null){
            System.out.println("myObject is null");
        }else {
            System.out.println(myObject.toString());
        }


    }
}
