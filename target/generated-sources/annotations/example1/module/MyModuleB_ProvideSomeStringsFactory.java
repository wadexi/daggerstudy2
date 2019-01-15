package example1.module;

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
public final class MyModuleB_ProvideSomeStringsFactory implements Factory<Set<String>> {
  private final Provider<DepA> depAProvider;

  private final Provider<DepB> depBProvider;

  public MyModuleB_ProvideSomeStringsFactory(
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
    return proxyProvideSomeStrings(depAProvider.get(), depBProvider.get());
  }

  public static MyModuleB_ProvideSomeStringsFactory create(
      Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    return new MyModuleB_ProvideSomeStringsFactory(depAProvider, depBProvider);
  }

  public static Set<String> proxyProvideSomeStrings(DepA depA, DepB depB) {
    return Preconditions.checkNotNull(
        MyModuleB.provideSomeStrings(depA, depB),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
