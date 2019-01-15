package example3.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import example1.bean.DepA;
import example1.bean.DepB;
import example3.annonate.MyQualifier;
import example3.bean.Foo;

@Module
public class ModuleC {

    @Provides
    @IntoSet
    @MyQualifier
    static Foo provideOneFoo(DepA depA, DepB depB){
        return new Foo(depA,depB);
    }

}
