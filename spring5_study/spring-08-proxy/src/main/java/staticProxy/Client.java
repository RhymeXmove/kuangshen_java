package staticProxy;

public class Client {
    public static void main(String[] args) {
        //1.找房东租房
        Host host = new Host();
        host.rent();
        System.out.println("=========");

        //2.找中介出租
        Proxy proxy = new Proxy(host);
        proxy.rent();

        /*
        缺点  ：一个真实角色就会产生一个代理角色，代码量会翻倍，开发效率会变低
         */
    }
}
