package example1;

import example1.compoent.DaggerMyComponent;
import example1.compoent.MyComponent;

public class Main {


    public static void main(String[] args) {

        MyComponent component = DaggerMyComponent.builder().build();
        System.out.println(component.strings().toString());

        assert component.getBar() != null;

    }



}
