import com.shan.dao.UserDaoMysqlImpl;
import com.shan.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        //用户实际调用的是业务层，dao层他们不需要接触！
        /*
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser(); */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl impl = (UserServiceImpl) context.getBean("UserServiceImpl");

        impl.getUser();
    }
}
