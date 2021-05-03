import config.KuangConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.User;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，就只能通过AnnotationConfig获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user);
    }
}
