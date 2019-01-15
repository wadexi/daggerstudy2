package example3.module;

import dagger.Module;
import dagger.Provides;
import example3.annonate.MyQualifier;
import example3.bean.Foo;
import example3.bean.FooSetUser;

import java.util.Set;

@Module
public class ModuleD {


    @Provides
    static FooSetUser provideFooSetUser(@MyQualifier Set<Foo> foos){
        return new FooSetUser(foos);
    }


}
