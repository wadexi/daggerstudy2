package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_ProvideThingValueFactory implements Factory<String> {
  private static final MyModule_ProvideThingValueFactory INSTANCE =
      new MyModule_ProvideThingValueFactory();

  @Override
  public String get() {
    return provideInstance();
  }

  public static String provideInstance() {
    return proxyProvideThingValue();
  }

  public static MyModule_ProvideThingValueFactory create() {
    return INSTANCE;
  }

  public static String proxyProvideThingValue() {
    return Preconditions.checkNotNull(
        MyModule.provideThingValue(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
