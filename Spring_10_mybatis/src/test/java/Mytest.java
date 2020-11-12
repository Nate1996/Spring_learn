import jdk.internal.util.xml.impl.Input;
import org.apache.ibatis.io.Resources;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Mytest {

    @Test
    public void test() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
    }
}
