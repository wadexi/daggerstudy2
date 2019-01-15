package example3.module;

import dagger.Module;
import dagger.Provides;
import example1.bean.DepA;
import example1.bean.DepB;

@Module
public class BeanModule {

    @Provides
    static DepA provideDepA(){
        return new DepA();
    }

    @Provides
    static DepB provideDepB(){
        return new DepB();
    }
}
