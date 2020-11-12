
import com.NATE.dao.UserDaoMysqlImpl;
import com.NATE.service.UserService;
import com.NATE.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

//        UserService userService=new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserdao(new UserDaoMysqlImpl());
//
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("ServiceImpl");
        userService.getUser();

    }
}
