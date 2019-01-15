package example2.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example2.bean.ClassA;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ModuleA_ProvideClassAFactory implements Factory<ClassA> {
  private static final ModuleA_ProvideClassAFactory INSTANCE = new ModuleA_ProvideClassAFactory();

  @Override
  public ClassA get() {
    return provideInstance();
  }

  public static ClassA provideInstance() {
    return proxyProvideClassA();
  }

  public static ModuleA_ProvideClassAFactory create() {
    return INSTANCE;
  }

  public static ClassA proxyProvideClassA() {
    return Preconditions.checkNotNull(
        ModuleA.provideClassA(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
