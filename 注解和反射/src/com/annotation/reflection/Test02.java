package com.annotation.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.annotation.reflection.User");
        System.out.println(c1);

        Class c2 = Class.forName("com.annotation.reflection.User");
        System.out.println(c2.hashCode());
        Class c3 = Class.forName("com.annotation.reflection.User");
        System.out.println(c3.hashCode());
        Class c4 = Class.forName("com.annotation.reflection.User");
        System.out.println(c4.hashCode());

    }
}

class User {
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}