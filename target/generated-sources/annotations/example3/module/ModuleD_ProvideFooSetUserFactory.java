package example3.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example3.bean.Foo;
import example3.bean.FooSetUser;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ModuleD_ProvideFooSetUserFactory implements Factory<FooSetUser> {
  private final Provider<Set<Foo>> foosProvider;

  public ModuleD_ProvideFooSetUserFactory(Provider<Set<Foo>> foosProvider) {
    this.foosProvider = foosProvider;
  }

  @Override
  public FooSetUser get() {
    return provideInstance(foosProvider);
  }

  public static FooSetUser provideInstance(Provider<Set<Foo>> foosProvider) {
    return proxyProvideFooSetUser(foosProvider.get());
  }

  public static ModuleD_ProvideFooSetUserFactory create(Provider<Set<Foo>> foosProvider) {
    return new ModuleD_ProvideFooSetUserFactory(foosProvider);
  }

  public static FooSetUser proxyProvideFooSetUser(Set<Foo> foos) {
    return Preconditions.checkNotNull(
        ModuleD.provideFooSetUser(foos),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
