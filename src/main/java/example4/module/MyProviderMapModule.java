package example4.module;

import dagger.Module;
import dagger.Provides;
import example4.bean.Bar;
import example4.bean.Foo;

import javax.inject.Provider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Module
public class MyProviderMapModule {

    @Provides
    static Map<Foo,Provider<Bar>> fooBarProviderMap(Set<Map.Entry<Foo,Provider<Bar>>> entries){
        Map<Foo,Provider<Bar>> map = new LinkedHashMap<>(entries.size());
        for (Map.Entry<Foo,Provider<Bar>> entry: entries){
            Foo key = entry.getKey();
            Provider<Bar> value = entry.getValue();
            map.put(key,value);
        }
        return map;
    }


}
