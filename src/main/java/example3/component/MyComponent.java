package example3.component;

import dagger.Component;
import example3.annonate.MyQualifier;
import example3.bean.Foo;
import example3.bean.FooSetUser;
import example3.module.*;

import javax.inject.Named;
import java.util.Set;

@Component(modules = {MyModuleA.class,MyModuleB.class,ModuleC.class,ModuleD.class,BeanModule.class})
public interface MyComponent {

    @Named("test1")
    Set<String> strings();

    @Named("test2")
    Set<String> strings2();


    @MyQualifier
    Set<Foo> getFoo();


    FooSetUser getFooSetUser();

}
