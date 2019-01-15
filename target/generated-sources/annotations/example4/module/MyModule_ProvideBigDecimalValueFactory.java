package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_ProvideBigDecimalValueFactory implements Factory<String> {
  private static final MyModule_ProvideBigDecimalValueFactory INSTANCE =
      new MyModule_ProvideBigDecimalValueFactory();

  @Override
  public String get() {
    return provideInstance();
  }

  public static String provideInstance() {
    return proxyProvideBigDecimalValue();
  }

  public static MyModule_ProvideBigDecimalValueFactory create() {
    return INSTANCE;
  }

  public static String proxyProvideBigDecimalValue() {
    return Preconditions.checkNotNull(
        MyModule.provideBigDecimalValue(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
