package example4.annotations;

import dagger.MapKey;

//@MapKey(unwrapValue = false)
@MapKey
public @interface MyKey {

    String value();
//    String name();
//
//    Class<?> implementingClass();
//
//    int[] thresholds();
}
