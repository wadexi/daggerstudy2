package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_ProvideABCValueFactory implements Factory<String> {
  private static final MyModule_ProvideABCValueFactory INSTANCE =
      new MyModule_ProvideABCValueFactory();

  @Override
  public String get() {
    return provideInstance();
  }

  public static String provideInstance() {
    return proxyProvideABCValue();
  }

  public static MyModule_ProvideABCValueFactory create() {
    return INSTANCE;
  }

  public static String proxyProvideABCValue() {
    return Preconditions.checkNotNull(
        MyModule.provideABCValue(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
