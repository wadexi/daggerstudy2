package example1.bean;

import java.util.Set;

import javax.inject.Inject;

public class Bar {

    @Inject
    Bar(Set<String> strings){
        assert strings.contains("ABC");
        assert strings.contains("DEF");
        assert strings.contains("GHI");
    }

}
