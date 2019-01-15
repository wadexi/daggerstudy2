package example3.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

import javax.inject.Named;

@Module
public class MyModuleA {

    @Provides
    @IntoSet
    @Named("test1")
    static String provideOneString(){
        return "ABC";
    }
}
