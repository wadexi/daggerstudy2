package example3.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example1.bean.DepA;
import example1.bean.DepB;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModuleB_ProvideSomeStringFactory implements Factory<Set<String>> {
  private final Provider<DepA> depAProvider;

  private final Provider<DepB> depBProvider;

  public MyModuleB_ProvideSomeStringFactory(
      Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    this.depAProvider = depAProvider;
    this.depBProvider = depBProvider;
  }

  @Override
  public Set<String> get() {
    return provideInstance(depAProvider, depBProvider);
  }

  public static Set<String> provideInstance(
      Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    return proxyProvideSomeString(depAProvider.get(), depBProvider.get());
  }

  public static MyModuleB_ProvideSomeStringFactory create(
      Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    return new MyModuleB_ProvideSomeStringFactory(depAProvider, depBProvider);
  }

  public static Set<String> proxyProvideSomeString(DepA depA, DepB depB) {
    return Preconditions.checkNotNull(
        MyModuleB.provideSomeString(depA, depB),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
