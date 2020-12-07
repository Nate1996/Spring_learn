import com.NATE.mapper.UserMapper;
import com.NATE.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Mytest {

    @Test
    public void test() throws IOException {
         String resources = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resources);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
