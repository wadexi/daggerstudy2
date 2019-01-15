package example4.annotations;

import dagger.MapKey;
import example4.bean.MyEnum;

@MapKey
public @interface MyEnumKey {

    MyEnum value();

}
