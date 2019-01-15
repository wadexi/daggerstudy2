package example4.bean;

public class Foo {

    private String tag;

    public Foo(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "tag='" + tag + '\'' +
                '}';
    }
}
