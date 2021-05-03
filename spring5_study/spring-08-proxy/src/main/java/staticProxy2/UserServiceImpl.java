package staticProxy2;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("执行了add");
    }

    public void update() {
        System.out.println("执行了update");
    }

    public void query() {
        System.out.println("执行了query");
    }

    public void delete() {
        System.out.println("执行了delete");
    }
}
