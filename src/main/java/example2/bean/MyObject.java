package example2.bean;

import javax.inject.Inject;

public class MyObject {


    public ClassA classA;

    public MyObject(){

    }

    @Inject
    public MyObject(ClassA classA){
        this.classA = classA;
    }

}
