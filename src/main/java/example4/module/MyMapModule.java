package example4.module;

import dagger.Module;
import dagger.Provides;
import example4.bean.Bar;
import example4.bean.Foo;

import javax.inject.Named;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Module
public class MyMapModule {

    @Provides
    static Map<Foo,Bar> fooBarMap(@Named("set1") Set<Map.Entry<Foo,Bar>> entries){
        Map<Foo,Bar> map = new LinkedHashMap<>(entries.size());
        for (Map.Entry<Foo,Bar> entry: entries){
            Foo key = entry.getKey();
            Bar value = entry.getValue();
            map.put(key,value);
        }
        return map;
    }

}
