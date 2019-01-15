package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example4.bean.Bar;
import example4.bean.Foo;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_EntryFactory implements Factory<Map.Entry<Foo, Provider<Bar>>> {
  private final Provider<Bar> barSubclassProvider;

  public MyModule_EntryFactory(Provider<Bar> barSubclassProvider) {
    this.barSubclassProvider = barSubclassProvider;
  }

  @Override
  public Map.Entry<Foo, Provider<Bar>> get() {
    return provideInstance(barSubclassProvider);
  }

  public static Map.Entry<Foo, Provider<Bar>> provideInstance(Provider<Bar> barSubclassProvider) {
    return proxyEntry(barSubclassProvider);
  }

  public static MyModule_EntryFactory create(Provider<Bar> barSubclassProvider) {
    return new MyModule_EntryFactory(barSubclassProvider);
  }

  public static Map.Entry<Foo, Provider<Bar>> proxyEntry(Provider<Bar> barSubclassProvider) {
    return Preconditions.checkNotNull(
        MyModule.entry(barSubclassProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
