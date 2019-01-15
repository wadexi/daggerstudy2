package example2.bean;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyObject_Factory implements Factory<MyObject> {
  private final Provider<ClassA> classAProvider;

  public MyObject_Factory(Provider<ClassA> classAProvider) {
    this.classAProvider = classAProvider;
  }

  @Override
  public MyObject get() {
    return provideInstance(classAProvider);
  }

  public static MyObject provideInstance(Provider<ClassA> classAProvider) {
    return new MyObject(classAProvider.get());
  }

  public static MyObject_Factory create(Provider<ClassA> classAProvider) {
    return new MyObject_Factory(classAProvider);
  }

  public static MyObject newMyObject(ClassA classA) {
    return new MyObject(classA);
  }
}
