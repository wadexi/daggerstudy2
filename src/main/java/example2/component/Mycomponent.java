package example2.component;

import dagger.Component;
import example2.bean.ClassA;
import example2.bean.ClassB;
import example2.modules.ModuleObject;
import example2.bean.MyObject;
import example2.modules.ModuleA;
import example2.modules.ModuleB;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ModuleA.class,ModuleB.class,ModuleObject.class})
public interface Mycomponent {

    ClassA getClassA();


    ClassB getClassB();

    MyObject getMyObject();

}
