package example3.bean;

import javax.inject.Inject;
import java.util.Set;

public class Bar {

    @Inject
    public Bar(Set<String> strings){
        assert strings.contains("ABC");
        assert strings.contains("DEF");
        assert strings.contains("GHI");
    }
}
