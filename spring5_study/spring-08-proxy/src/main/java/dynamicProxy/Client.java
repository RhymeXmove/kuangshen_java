package dynamicProxy;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //生成代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用处理程序 来处理我们要调用的接口对象
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();//动态生成的代理类
        proxy.rent();
    }
}
