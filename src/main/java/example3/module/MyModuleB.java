package example3.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;
import example1.bean.DepA;
import example1.bean.DepB;

import javax.inject.Named;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Module
public class MyModuleB {

    @Provides
    @ElementsIntoSet
    @Named("test2")
    static Set<String> provideSomeString(DepA depA, DepB depB){

        return new HashSet<String>(Arrays.asList("DEF","GHI"));
    }


}
