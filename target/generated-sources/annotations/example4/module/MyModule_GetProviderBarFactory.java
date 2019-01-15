package example4.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example4.bean.Bar;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_GetProviderBarFactory implements Factory<Bar> {
  private static final MyModule_GetProviderBarFactory INSTANCE =
      new MyModule_GetProviderBarFactory();

  @Override
  public Bar get() {
    return provideInstance();
  }

  public static Bar provideInstance() {
    return proxyGetProviderBar();
  }

  public static MyModule_GetProviderBarFactory create() {
    return INSTANCE;
  }

  public static Bar proxyGetProviderBar() {
    return Preconditions.checkNotNull(
        MyModule.getProviderBar(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
