package com.annotation.reflection;

//测试class 类的创建方式有哪些
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        // 方式一 ： 通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 方式二 ： forname 获得
        Class c2 = Class.forName("com.annotation.reflection.Student");
        System.out.println(c2.hashCode());

        //方式三 ： 通过类名.class 获得
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式四 ： 内置基本数据类型可以直接用类名.Type；
        Class<Integer> type = Integer.TYPE;
        System.out.println(type.hashCode());

        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}

class Person {
    String name;
    public Person() {}
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "Teac";
    }
}