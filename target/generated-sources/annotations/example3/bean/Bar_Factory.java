package example3.bean;

import dagger.internal.Factory;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Bar_Factory implements Factory<Bar> {
  private final Provider<Set<String>> stringsProvider;

  public Bar_Factory(Provider<Set<String>> stringsProvider) {
    this.stringsProvider = stringsProvider;
  }

  @Override
  public Bar get() {
    return provideInstance(stringsProvider);
  }

  public static Bar provideInstance(Provider<Set<String>> stringsProvider) {
    return new Bar(stringsProvider.get());
  }

  public static Bar_Factory create(Provider<Set<String>> stringsProvider) {
    return new Bar_Factory(stringsProvider);
  }

  public static Bar newBar(Set<String> strings) {
    return new Bar(strings);
  }
}
