package example4.annotations;

import dagger.MapKey;

@MapKey
public @interface MyNumberClassKey {

    Class<? extends Number> value();

}
