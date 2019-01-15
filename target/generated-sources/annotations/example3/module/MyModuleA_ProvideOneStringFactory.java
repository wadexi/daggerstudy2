package example3.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModuleA_ProvideOneStringFactory implements Factory<String> {
  private static final MyModuleA_ProvideOneStringFactory INSTANCE =
      new MyModuleA_ProvideOneStringFactory();

  @Override
  public String get() {
    return provideInstance();
  }

  public static String provideInstance() {
    return proxyProvideOneString();
  }

  public static MyModuleA_ProvideOneStringFactory create() {
    return INSTANCE;
  }

  public static String proxyProvideOneString() {
    return Preconditions.checkNotNull(
        MyModuleA.provideOneString(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
