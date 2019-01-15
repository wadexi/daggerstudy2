package example3.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example1.bean.DepB;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BeanModule_ProvideDepBFactory implements Factory<DepB> {
  private static final BeanModule_ProvideDepBFactory INSTANCE = new BeanModule_ProvideDepBFactory();

  @Override
  public DepB get() {
    return provideInstance();
  }

  public static DepB provideInstance() {
    return proxyProvideDepB();
  }

  public static BeanModule_ProvideDepBFactory create() {
    return INSTANCE;
  }

  public static DepB proxyProvideDepB() {
    return Preconditions.checkNotNull(
        BeanModule.provideDepB(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
