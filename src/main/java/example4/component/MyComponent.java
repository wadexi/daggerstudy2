package example4.component;

import dagger.Component;
import dagger.MapKey;
import example4.annotations.MyKey;
import example4.bean.Bar;
import example4.bean.Foo;
import example4.bean.MyEnum;
import example4.bean.Thing;
import example4.module.MyMapModule;
import example4.module.MyModule;
import example4.module.MyProviderMapModule;

import javax.inject.Provider;
import java.util.Map;

@Component(modules = {MyModule.class,MyMapModule.class,MyProviderMapModule.class})
public interface MyComponent {

    Map<String,Long> longByString();

    Map<Class<?>,String> stringByClass();

    Map<MyEnum,String> myEnumString();

    Map<Class<? extends Number>,String> stringsByNumberClass();

   /* Map<MyKey,String> myKeyStringMap();*/

    Map<Foo,Bar> getunKnownKeyMap();

    Map<Foo,Provider<Bar>> getProviderValueMap();



}
