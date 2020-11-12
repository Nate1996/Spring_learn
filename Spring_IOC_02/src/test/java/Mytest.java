import com.NATE.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        //Spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user2");

        user.show();
    }
}
