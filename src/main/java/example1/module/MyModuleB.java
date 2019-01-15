package example1.module;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import example1.bean.DepA;
import example1.bean.DepB;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;

/**
 * 可以通过添加返回子集的模块方法一次提供多个元素，并使用@ElementsIntoSet进行注释
 */
@Module
public class MyModuleB {

    @Provides
    @ElementsIntoSet
    static Set<String> provideSomeStrings(DepA depA, DepB depB){
        return new HashSet<String>(Arrays.asList("DEF","GHI"));
    }

}
