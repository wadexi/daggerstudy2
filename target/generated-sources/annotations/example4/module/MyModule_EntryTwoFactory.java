package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example4.bean.Bar;
import example4.bean.Foo;
import java.util.Map;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_EntryTwoFactory implements Factory<Map.Entry<Foo, Bar>> {
  private static final MyModule_EntryTwoFactory INSTANCE = new MyModule_EntryTwoFactory();

  @Override
  public Map.Entry<Foo, Bar> get() {
    return provideInstance();
  }

  public static Map.Entry<Foo, Bar> provideInstance() {
    return proxyEntryTwo();
  }

  public static MyModule_EntryTwoFactory create() {
    return INSTANCE;
  }

  public static Map.Entry<Foo, Bar> proxyEntryTwo() {
    return Preconditions.checkNotNull(
        MyModule.entryTwo(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
