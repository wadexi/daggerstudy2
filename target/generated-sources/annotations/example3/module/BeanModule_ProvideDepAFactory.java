package example3.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example1.bean.DepA;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BeanModule_ProvideDepAFactory implements Factory<DepA> {
  private static final BeanModule_ProvideDepAFactory INSTANCE = new BeanModule_ProvideDepAFactory();

  @Override
  public DepA get() {
    return provideInstance();
  }

  public static DepA provideInstance() {
    return proxyProvideDepA();
  }

  public static BeanModule_ProvideDepAFactory create() {
    return INSTANCE;
  }

  public static DepA proxyProvideDepA() {
    return Preconditions.checkNotNull(
        BeanModule.provideDepA(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
