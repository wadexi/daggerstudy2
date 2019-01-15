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
public final class MyProviderMapModule_FooBarProviderMapFactory
    implements Factory<Map<Foo, Provider<Bar>>> {
  private final Provider<Set<Map.Entry<Foo, Provider<Bar>>>> entriesProvider;

  public MyProviderMapModule_FooBarProviderMapFactory(
      Provider<Set<Map.Entry<Foo, Provider<Bar>>>> entriesProvider) {
    this.entriesProvider = entriesProvider;
  }

  @Override
  public Map<Foo, Provider<Bar>> get() {
    return provideInstance(entriesProvider);
  }

  public static Map<Foo, Provider<Bar>> provideInstance(
      Provider<Set<Map.Entry<Foo, Provider<Bar>>>> entriesProvider) {
    return proxyFooBarProviderMap(entriesProvider.get());
  }

  public static MyProviderMapModule_FooBarProviderMapFactory create(
      Provider<Set<Map.Entry<Foo, Provider<Bar>>>> entriesProvider) {
    return new MyProviderMapModule_FooBarProviderMapFactory(entriesProvider);
  }

  public static Map<Foo, Provider<Bar>> proxyFooBarProviderMap(
      Set<Map.Entry<Foo, Provider<Bar>>> entries) {
    return Preconditions.checkNotNull(
        MyProviderMapModule.fooBarProviderMap(entries),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
