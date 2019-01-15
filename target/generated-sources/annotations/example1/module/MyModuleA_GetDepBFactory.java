package example1.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import example1.bean.DepB;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModuleA_GetDepBFactory implements Factory<DepB> {
  private static final MyModuleA_GetDepBFactory INSTANCE = new MyModuleA_GetDepBFactory();

  @Override
  public DepB get() {
    return provideInstance();
  }

  public static DepB provideInstance() {
    return proxyGetDepB();
  }

  public static MyModuleA_GetDepBFactory create() {
    return INSTANCE;
  }

  public static DepB proxyGetDepB() {
    return Preconditions.checkNotNull(
        MyModuleA.getDepB(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
