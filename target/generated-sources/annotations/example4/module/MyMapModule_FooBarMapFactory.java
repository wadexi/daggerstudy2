package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example4.bean.Bar;
import example4.bean.Foo;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyMapModule_FooBarMapFactory implements Factory<Map<Foo, Bar>> {
  private final Provider<Set<Map.Entry<Foo, Bar>>> entriesProvider;

  public MyMapModule_FooBarMapFactory(Provider<Set<Map.Entry<Foo, Bar>>> entriesProvider) {
    this.entriesProvider = entriesProvider;
  }

  @Override
  public Map<Foo, Bar> get() {
    return provideInstance(entriesProvider);
  }

  public static Map<Foo, Bar> provideInstance(Provider<Set<Map.Entry<Foo, Bar>>> entriesProvider) {
    return proxyFooBarMap(entriesProvider.get());
  }

  public static MyMapModule_FooBarMapFactory create(
      Provider<Set<Map.Entry<Foo, Bar>>> entriesProvider) {
    return new MyMapModule_FooBarMapFactory(entriesProvider);
  }

  public static Map<Foo, Bar> proxyFooBarMap(Set<Map.Entry<Foo, Bar>> entries) {
    return Preconditions.checkNotNull(
        MyMapModule.fooBarMap(entries), "Cannot return null from a non-@Nullable @Provides method");
  }
}
