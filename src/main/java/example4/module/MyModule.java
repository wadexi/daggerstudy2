package example4.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import example1.bean.DepA;
import example1.bean.DepB;
import example4.annotations.MyEnumKey;
import example4.annotations.MyKey;
import example4.annotations.MyNumberClassKey;
import example4.bean.Bar;
import example4.bean.Foo;
import example4.bean.MyEnum;
import example4.bean.Thing;

import javax.inject.Named;
import javax.inject.Provider;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.Map;

@Module
public class MyModule {

    @Provides
    @IntoMap
    @StringKey("foo")
    static Long provideFooValue(){
        return 100L;
    }

    @Provides
    @IntoMap
    @ClassKey(Thing.class)
    static String provideThingValue(){
        return "value for thing";
    }

    @Provides
    @IntoMap
    @MyEnumKey(MyEnum.ABC)
    static String provideABCValue(){
        return "value for abc";
    }


    @Provides
    @IntoMap
    @MyNumberClassKey(BigDecimal.class)
    static String provideBigDecimalValue(){
        return "value for BigDecimal";
    }

   /* @Provides
    @IntoMap
    @MyKey(name = "abc",implementingClass =ABC.class,thresholds = {1,2,3})
    static String provideAbc1510Value(){
        return "foo";
    }*/


   @Provides
   @IntoSet
   @Named("set1")
   static Map.Entry<Foo,Bar> entryOne(){
       Foo foo = new Foo("entryOne key foo");
       Bar bar = new Bar("entryOne value bar");
       return new AbstractMap.SimpleImmutableEntry<Foo,Bar>(foo,bar);
   }


    @Provides
    @IntoSet
    @Named("set2")
    static Map.Entry<Foo,Bar> entryTwo(){
        Foo foo = new Foo("entryTwo key foo");
        Bar bar = new Bar("entryTwo value bar");
        return new AbstractMap.SimpleImmutableEntry<Foo,Bar>(foo,bar);
    }

    @Provides
    @IntoSet
    static Map.Entry<Foo,Provider<Bar>> entry(Provider<Bar> barSubclassProvider){

       Foo key = new Foo("entry key foo");

       return new AbstractMap.SimpleImmutableEntry<Foo,Provider<Bar>>(key,barSubclassProvider);
    }

    @Provides
    static Bar getProviderBar(){
       Bar bar = new Bar("getProviderBar bar 1");
       return bar;
    }


}
