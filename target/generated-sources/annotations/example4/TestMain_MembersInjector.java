package example4;

import dagger.MembersInjector;
import example4.bean.Bar;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TestMain_MembersInjector implements MembersInjector<TestMain> {
  private final Provider<Bar> barProvider;

  public TestMain_MembersInjector(Provider<Bar> barProvider) {
    this.barProvider = barProvider;
  }

  public static MembersInjector<TestMain> create(Provider<Bar> barProvider) {
    return new TestMain_MembersInjector(barProvider);
  }

  @Override
  public void injectMembers(TestMain instance) {
    injectBarProvider(instance, barProvider);
  }

  public static void injectBarProvider(TestMain instance, Provider<Bar> barProvider) {
    instance.barProvider = barProvider;
  }
}
