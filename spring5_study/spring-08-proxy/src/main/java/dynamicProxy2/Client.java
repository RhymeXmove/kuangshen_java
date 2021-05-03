package dynamicProxy2;

import staticProxy2.UserService;
import staticProxy2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //生成代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);//设置要代理的对象
        UserService proxy = (UserService) pih.getProxy();//代理角色

        proxy.add();

        //一个动态代理类可以代理多个类，只要是同一个接口下
    }
}
