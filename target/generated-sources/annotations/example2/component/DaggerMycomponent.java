package example2.component;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import example2.bean.ClassA;
import example2.bean.ClassB;
import example2.bean.MyObject;
import example2.modules.ModuleA;
import example2.modules.ModuleA_ProvideClassAFactory;
import example2.modules.ModuleB;
import example2.modules.ModuleB_ProvideClassBFactory;
import example2.modules.ModuleObject;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMycomponent implements Mycomponent {
  private Provider<ClassA> provideClassAProvider;

  private Provider<ClassB> provideClassBProvider;

  private DaggerMycomponent(Builder builder) {

    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static Mycomponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideClassAProvider = DoubleCheck.provider(ModuleA_ProvideClassAFactory.create());
    this.provideClassBProvider = DoubleCheck.provider(ModuleB_ProvideClassBFactory.create());
  }

  @Override
  public ClassA getClassA() {
    return provideClassAProvider.get();
  }

  @Override
  public ClassB getClassB() {
    return provideClassBProvider.get();
  }

  @Override
  public MyObject getMyObject() {
    return new MyObject(provideClassAProvider.get());
  }

  public static final class Builder {
    private Builder() {}

    public Mycomponent build() {
      return new DaggerMycomponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder moduleA(ModuleA moduleA) {
      Preconditions.checkNotNull(moduleA);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder moduleB(ModuleB moduleB) {
      Preconditions.checkNotNull(moduleB);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder moduleObject(ModuleObject moduleObject) {
      Preconditions.checkNotNull(moduleObject);
      return this;
    }
  }
}
