package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pojo.User;

@Configuration //代表这是一个配置类，相当于beans.xml
@ComponentScan("pojo")
@Import(KuangConfig2.class)//相当于 引入一个配置类 <import resource = "xxxx"/>
public class KuangConfig {
    //注册一个bean
    @Bean   //<bean id = "getUser" class = "pojo.User"/>
    public User getUser(){
        return new User();//相当于 class = "pojo.User"
    }
}
