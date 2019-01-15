package example3.bean;

import javax.inject.Inject;
import java.util.Set;

public class FooSetUser {

    private Set<Foo> foos;


    public FooSetUser(Set<Foo> foos) {
        this.foos = foos;
    }

    @Override
    public String toString() {
        return "FooSetUser{" +
                "foos=" + foos +
                '}';
    }
}
