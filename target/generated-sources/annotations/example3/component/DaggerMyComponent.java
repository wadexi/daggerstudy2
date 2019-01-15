package example3.component;

import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import example3.bean.Foo;
import example3.bean.FooSetUser;
import example3.module.BeanModule;
import example3.module.BeanModule_ProvideDepAFactory;
import example3.module.BeanModule_ProvideDepBFactory;
import example3.module.ModuleC;
import example3.module.ModuleC_ProvideOneFooFactory;
import example3.module.ModuleD;
import example3.module.ModuleD_ProvideFooSetUserFactory;
import example3.module.MyModuleA;
import example3.module.MyModuleA_ProvideOneStringFactory;
import example3.module.MyModuleB;
import example3.module.MyModuleB_ProvideSomeStringFactory;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMyComponent implements MyComponent {
  private DaggerMyComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static MyComponent create() {
    return new Builder().build();
  }

  private Set<String> getNamedSetOfString() {
    return MyModuleB_ProvideSomeStringFactory.proxyProvideSomeString(
        BeanModule_ProvideDepAFactory.proxyProvideDepA(),
        BeanModule_ProvideDepBFactory.proxyProvideDepB());
  }

  private Foo getMyQualifierFoo() {
    return ModuleC_ProvideOneFooFactory.proxyProvideOneFoo(
        BeanModule_ProvideDepAFactory.proxyProvideDepA(),
        BeanModule_ProvideDepBFactory.proxyProvideDepB());
  }

  @Override
  public Set<String> strings() {
    return Collections.<String>singleton(MyModuleA_ProvideOneStringFactory.proxyProvideOneString());
  }

  @Override
  public Set<String> strings2() {
    return SetBuilder.<String>newSetBuilder(1).addAll(getNamedSetOfString()).build();
  }

  @Override
  public Set<Foo> getFoo() {
    return Collections.<Foo>singleton(getMyQualifierFoo());
  }

  @Override
  public FooSetUser getFooSetUser() {
    return ModuleD_ProvideFooSetUserFactory.proxyProvideFooSetUser(getFoo());
  }

  public static final class Builder {
    private Builder() {}

    public MyComponent build() {
      return new DaggerMyComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder myModuleA(MyModuleA myModuleA) {
      Preconditions.checkNotNull(myModuleA);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder myModuleB(MyModuleB myModuleB) {
      Preconditions.checkNotNull(myModuleB);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder moduleC(ModuleC moduleC) {
      Preconditions.checkNotNull(moduleC);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder moduleD(ModuleD moduleD) {
      Preconditions.checkNotNull(moduleD);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder beanModule(BeanModule beanModule) {
      Preconditions.checkNotNull(beanModule);
      return this;
    }
  }
}
