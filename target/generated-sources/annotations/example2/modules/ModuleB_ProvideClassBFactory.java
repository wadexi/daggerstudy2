package example2.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example2.bean.ClassB;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ModuleB_ProvideClassBFactory implements Factory<ClassB> {
  private static final ModuleB_ProvideClassBFactory INSTANCE = new ModuleB_ProvideClassBFactory();

  @Override
  public ClassB get() {
    return provideInstance();
  }

  public static ClassB provideInstance() {
    return proxyProvideClassB();
  }

  public static ModuleB_ProvideClassBFactory create() {
    return INSTANCE;
  }

  public static ClassB proxyProvideClassB() {
    return Preconditions.checkNotNull(
        ModuleB.provideClassB(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
