import com.NATE.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //对象都在Spring中进行管理
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
        hello.setName("Spring");
        hello.show();

    }
}
