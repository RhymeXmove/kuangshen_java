package java.lang;

public class String {
    // 双亲委派机制：安全
    //1. AppClassLoader -->ExtClassLoader-->BootStrapLoader(最终执行)

    public String toString() {
        return "hello";
    }

    public static void main(String[] args) {
        String s = new String();
        s.toString();
    }
}
