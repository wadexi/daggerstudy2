package example1.module;


import example1.bean.DepA;
import example1.bean.DepB;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class MyModuleA {

    @Provides
    static DepA getDepA(){
        return new DepA();
    }

    @Provides
    static DepB getDepB(){
        return new DepB();
    }

    @Provides
    @IntoSet
    static String provideOneString(DepA depA, DepB depB){
        return "ABC";
    }







}
