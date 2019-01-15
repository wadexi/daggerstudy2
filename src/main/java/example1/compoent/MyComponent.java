package example1.compoent;


import java.util.Set;

import example1.bean.Bar;
import dagger.Component;
import example1.module.MyModuleA;
import example1.module.MyModuleB;

@Component(modules = {MyModuleA.class, MyModuleB.class})
public interface MyComponent {

    Set<String> strings();
    Bar getBar();

}
