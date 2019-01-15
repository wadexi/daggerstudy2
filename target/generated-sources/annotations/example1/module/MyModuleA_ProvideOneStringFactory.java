package example1.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example1.bean.DepA;
import example1.bean.DepB;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModuleA_ProvideOneStringFactory implements Factory<String> {
  private final Provider<DepA> depAProvider;

  private final Provider<DepB> depBProvider;

  public MyModuleA_ProvideOneStringFactory(
      Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    this.depAProvider = depAProvider;
    this.depBProvider = depBProvider;
  }

  @Override
  public String get() {
    return provideInstance(depAProvider, depBProvider);
  }

  public static String provideInstance(Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    return proxyProvideOneString(depAProvider.get(), depBProvider.get());
  }

  public static MyModuleA_ProvideOneStringFactory create(
      Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    return new MyModuleA_ProvideOneStringFactory(depAProvider, depBProvider);
  }

  public static String proxyProvideOneString(DepA depA, DepB depB) {
    return Preconditions.checkNotNull(
        MyModuleA.provideOneString(depA, depB),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
