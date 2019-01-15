package example2.modules;

import dagger.Module;
import dagger.Provides;
import example2.bean.ClassA;
import example2.bean.ClassB;

import javax.inject.Singleton;

@Module
public class ModuleA {

    @Singleton
    @Provides
    static  ClassA provideClassA(){
        return new ClassA();
    }


}
