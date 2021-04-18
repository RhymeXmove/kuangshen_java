package com.thread.线程同步;
// 不安全取钱
// 两个人去取钱
public class UnsafeBank {
    public static void main(String[] args) {
        // 账户
        Account account = new Account(10000, "存款金额");
        Drawing you = new Drawing(account, 50, "你");
        Drawing gf = new Drawing(account, 100, "对方");
        you.start();
        gf.start();
    }
}

// 账户
class Account{
    int money; // 余额
    String name; // 卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
// 银行 模拟取款
class Drawing extends Thread {
    Account account; // 账户
    int drawingMoney; // 取了多少钱
    int nowMoney; // 还剩多少钱

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //取钱操作
    @Override
    public void run() {
        //锁的对象必须是变化的量
        synchronized (account) {
            // 判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够，取不了咯！");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 卡内余额 = 余额 - 你取的钱
            account.money = account.money - drawingMoney;
            // 你手里的钱
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.name + "余额为：" + account.money);
            // 此时 Thread.currentThread().getName() = this.getName()
            System.out.println(this.getName() + "手里的钱：" + nowMoney);
        }
    }
}
