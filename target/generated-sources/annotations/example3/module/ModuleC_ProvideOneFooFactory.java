package example3.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example1.bean.DepA;
import example1.bean.DepB;
import example3.bean.Foo;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ModuleC_ProvideOneFooFactory implements Factory<Foo> {
  private final Provider<DepA> depAProvider;

  private final Provider<DepB> depBProvider;

  public ModuleC_ProvideOneFooFactory(Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    this.depAProvider = depAProvider;
    this.depBProvider = depBProvider;
  }

  @Override
  public Foo get() {
    return provideInstance(depAProvider, depBProvider);
  }

  public static Foo provideInstance(Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    return proxyProvideOneFoo(depAProvider.get(), depBProvider.get());
  }

  public static ModuleC_ProvideOneFooFactory create(
      Provider<DepA> depAProvider, Provider<DepB> depBProvider) {
    return new ModuleC_ProvideOneFooFactory(depAProvider, depBProvider);
  }

  public static Foo proxyProvideOneFoo(DepA depA, DepB depB) {
    return Preconditions.checkNotNull(
        ModuleC.provideOneFoo(depA, depB),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
