package example3;

import example3.bean.Foo;
import example3.bean.FooSetUser;
import example3.component.DaggerMyComponent;
import example3.component.MyComponent;
import org.junit.Test;

import java.util.Set;


public class TestMain {

    @Test
    public void test(){
        MyComponent myComponent = DaggerMyComponent.builder().build();
        Set<String> strings = myComponent.strings();
        System.out.println(strings.toString());
        Set<String> strings2 = myComponent.strings2();
        System.out.println(strings2.toString());

        Set<Foo> foo = myComponent.getFoo();
        System.out.println(foo.toString());


        FooSetUser fooSetUser = myComponent.getFooSetUser();
        System.out.println(fooSetUser.toString());


    }

}
