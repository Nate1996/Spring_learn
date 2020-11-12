import com.NATE.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people =context.getBean("people",People.class);
    try {
        people.getDog().shout();
        people.getCat().shout();

    }
    catch (Exception e) {
        System.out.println(e);
    }

    }
}
