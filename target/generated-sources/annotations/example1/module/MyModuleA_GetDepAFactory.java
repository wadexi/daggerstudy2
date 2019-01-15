package example1.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example1.bean.DepA;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModuleA_GetDepAFactory implements Factory<DepA> {
  private static final MyModuleA_GetDepAFactory INSTANCE = new MyModuleA_GetDepAFactory();

  @Override
  public DepA get() {
    return provideInstance();
  }

  public static DepA provideInstance() {
    return proxyGetDepA();
  }

  public static MyModuleA_GetDepAFactory create() {
    return INSTANCE;
  }

  public static DepA proxyGetDepA() {
    return Preconditions.checkNotNull(
        MyModuleA.getDepA(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
