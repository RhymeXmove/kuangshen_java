import com.shan.pojo.Hello;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        //获取spring的上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在spring管理了,我们要使用，直接去里面取出来就可以！
        Hello hello =(Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
