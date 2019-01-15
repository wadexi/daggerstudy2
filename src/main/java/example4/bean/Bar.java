package example4.bean;

public class Bar {

    private String tag;

    public Bar(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "tag='" + tag + '\'' +
                '}';
    }
}
