package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_ProvideFooValueFactory implements Factory<Long> {
  private static final MyModule_ProvideFooValueFactory INSTANCE =
      new MyModule_ProvideFooValueFactory();

  @Override
  public Long get() {
    return provideInstance();
  }

  public static Long provideInstance() {
    return proxyProvideFooValue();
  }

  public static MyModule_ProvideFooValueFactory create() {
    return INSTANCE;
  }

  public static Long proxyProvideFooValue() {
    return Preconditions.checkNotNull(
        MyModule.provideFooValue(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
