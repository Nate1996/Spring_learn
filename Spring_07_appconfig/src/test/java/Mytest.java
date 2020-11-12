import com.NATE.pojo.Myappconfig;
import com.NATE.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    @Test
    public void test(){
        // 如果完全使用了配置类方式去实现，就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(Myappconfig.class);
        User getuser= context.getBean("user",User.class);

        System.out.println(getuser.getName());
    }
}
