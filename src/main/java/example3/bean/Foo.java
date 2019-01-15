package example3.bean;

import example1.bean.DepA;
import example1.bean.DepB;

public class Foo {

    private DepA depA;
    private DepB depB;

    public Foo(DepA depA, DepB depB) {
        this.depA = depA;
        this.depB = depB;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "depA=" + depA +
                ", depB=" + depB +
                '}';
    }
}
