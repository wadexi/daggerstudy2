package example4.component;

import dagger.internal.Preconditions;
import example4.bean.Bar;
import example4.bean.Foo;
import example4.bean.MyEnum;
import example4.bean.Thing;
import example4.module.MyMapModule;
import example4.module.MyMapModule_FooBarMapFactory;
import example4.module.MyModule;
import example4.module.MyModule_EntryFactory;
import example4.module.MyModule_EntryOneFactory;
import example4.module.MyModule_GetProviderBarFactory;
import example4.module.MyModule_ProvideABCValueFactory;
import example4.module.MyModule_ProvideBigDecimalValueFactory;
import example4.module.MyModule_ProvideFooValueFactory;
import example4.module.MyModule_ProvideThingValueFactory;
import example4.module.MyProviderMapModule;
import example4.module.MyProviderMapModule_FooBarProviderMapFactory;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMyComponent implements MyComponent {
  private DaggerMyComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static MyComponent create() {
    return new Builder().build();
  }

  private Set<Map.Entry<Foo, Bar>> getNamedSetOfEntryOfFooAndBar() {
    return Collections.<Map.Entry<Foo, Bar>>singleton(MyModule_EntryOneFactory.proxyEntryOne());
  }

  private Map.Entry<Foo, Provider<Bar>> getEntryOfFooAndProviderOfBar() {
    return MyModule_EntryFactory.proxyEntry(MyModule_GetProviderBarFactory.create());
  }

  private Set<Map.Entry<Foo, Provider<Bar>>> getSetOfEntryOfFooAndProviderOfBar() {
    return Collections.<Map.Entry<Foo, Provider<Bar>>>singleton(getEntryOfFooAndProviderOfBar());
  }

  @Override
  public Map<String, Long> longByString() {
    return Collections.<String, Long>singletonMap(
        "foo", MyModule_ProvideFooValueFactory.proxyProvideFooValue());
  }

  @Override
  public Map<Class<?>, String> stringByClass() {
    return Collections.<Class<?>, String>singletonMap(
        Thing.class, MyModule_ProvideThingValueFactory.proxyProvideThingValue());
  }

  @Override
  public Map<MyEnum, String> myEnumString() {
    return Collections.<MyEnum, String>singletonMap(
        MyEnum.ABC, MyModule_ProvideABCValueFactory.proxyProvideABCValue());
  }

  @Override
  public Map<Class<? extends Number>, String> stringsByNumberClass() {
    return Collections.<Class<? extends Number>, String>singletonMap(
        BigDecimal.class, MyModule_ProvideBigDecimalValueFactory.proxyProvideBigDecimalValue());
  }

  @Override
  public Map<Foo, Bar> getunKnownKeyMap() {
    return MyMapModule_FooBarMapFactory.proxyFooBarMap(getNamedSetOfEntryOfFooAndBar());
  }

  @Override
  public Map<Foo, Provider<Bar>> getProviderValueMap() {
    return MyProviderMapModule_FooBarProviderMapFactory.proxyFooBarProviderMap(
        getSetOfEntryOfFooAndProviderOfBar());
  }

  public static final class Builder {
    private Builder() {}

    public MyComponent build() {
      return new DaggerMyComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder myModule(MyModule myModule) {
      Preconditions.checkNotNull(myModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder myMapModule(MyMapModule myMapModule) {
      Preconditions.checkNotNull(myMapModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder myProviderMapModule(MyProviderMapModule myProviderMapModule) {
      Preconditions.checkNotNull(myProviderMapModule);
      return this;
    }
  }
}
