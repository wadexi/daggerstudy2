package example4;


import example4.annotations.MyKey;
import example4.bean.Bar;
import example4.bean.Foo;
import example4.bean.MyEnum;
import example4.component.DaggerMyComponent;
import example4.component.MyComponent;
import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.Map;
import java.util.Set;

public class TestMain {

    @Inject
    public Provider<Bar> barProvider;

    public void inject(){
        MyComponent build = DaggerMyComponent.builder().build();
    }

    @Test
    public void test(){

        MyComponent myComponent = DaggerMyComponent.builder().build();
        Map<String, Long> stringLongMap = myComponent.longByString();
        System.out.println("stringLongMap:");
        Set<String> strings = stringLongMap.keySet();
        for (String string:strings){
            System.out.println("key:" + string + "   value:" + stringLongMap.get(string));
        }

        System.out.println("stringByClass:");
        Map<Class<?>, String> classStringMap = myComponent.stringByClass();
        Set<Class<?>> classes = classStringMap.keySet();
        for (Class clazz:classes){
            System.out.println("key:" + clazz.getCanonicalName() + "   value:" + classStringMap.get(clazz));
        }

        System.out.println("myEnumString:");
        Map<MyEnum, String> myEnumStringMap = myComponent.myEnumString();
        Set<MyEnum> myEnums = myEnumStringMap.keySet();
        for (MyEnum myEnum:myEnums){
            System.out.println("key:" + myEnum.name() + "   value:" + myEnumStringMap.get(myEnum));
        }

        System.out.println("stringsByNumberClass:");
        Map<Class<? extends Number>, String> classStringMap1 = myComponent.stringsByNumberClass();
        Set<Class<? extends Number>> classes1 = classStringMap1.keySet();
        for (Class<? extends Number> number:classes1){
            System.out.println("key:" + number.getCanonicalName() + "   value:" + classStringMap1.get(number));
        }


        System.out.println("getunKnownKeyMap:");
        Map<Foo, Bar> map = myComponent.getunKnownKeyMap();
        Set<Foo> foos = map.keySet();
        for (Foo foo:foos){
            System.out.println("key:" + foos.toString() + "   value:" + map.get(foo).toString());
        }


        System.out.println("getProviderValueMap:");
        Map<Foo, Provider<Bar>> providerValueMap = myComponent.getProviderValueMap();
        Set<Foo> foos1 = providerValueMap.keySet();
        for (Foo foo:foos1){
            System.out.println("key:" + foos.toString() + "   value:" + providerValueMap.get(foo).get().toString());
        }


        TestMain testMain = new TestMain();
        testMain.inject();
        if(testMain.barProvider == null){
            System.out.println(" barProvider == null");
        }

    }

//    @AutoAnnotation
//    static MyKey createMyKey(String name,Class<?> implementingClass,int[] thresholds){
////        return new Ann
//
//    }
}
