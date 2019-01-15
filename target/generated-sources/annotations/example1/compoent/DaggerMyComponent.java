package example1.compoent;

import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import example1.bean.Bar;
import example1.bean.Bar_Factory;
import example1.module.MyModuleA;
import example1.module.MyModuleA_GetDepAFactory;
import example1.module.MyModuleA_GetDepBFactory;
import example1.module.MyModuleA_ProvideOneStringFactory;
import example1.module.MyModuleB;
import example1.module.MyModuleB_ProvideSomeStringsFactory;
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

  private String getString() {
    return MyModuleA_ProvideOneStringFactory.proxyProvideOneString(
        MyModuleA_GetDepAFactory.proxyGetDepA(), MyModuleA_GetDepBFactory.proxyGetDepB());
  }

  private Set<String> getSetOfString() {
    return MyModuleB_ProvideSomeStringsFactory.proxyProvideSomeStrings(
        MyModuleA_GetDepAFactory.proxyGetDepA(), MyModuleA_GetDepBFactory.proxyGetDepB());
  }

  @Override
  public Set<String> strings() {
    return SetBuilder.<String>newSetBuilder(2).add(getString()).addAll(getSetOfString()).build();
  }

  @Override
  public Bar getBar() {
    return Bar_Factory.newBar(strings());
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
  }
}
