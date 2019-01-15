package example2.modules;

import dagger.Module;
import dagger.Provides;
import example2.bean.ClassB;

import javax.inject.Singleton;

@Module
public class ModuleB {



    @Singleton
    @Provides
    static ClassB provideClassB(){
        return new ClassB();
    }

}
