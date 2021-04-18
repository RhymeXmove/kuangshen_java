package com.annotation.reflection;


import java.lang.annotation.*;
import java.lang.reflect.Field;

//orm

public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.annotation.reflection.Stu");

        // 通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获得注解的value的值
        TableStu tableStu = (TableStu)c1.getAnnotation(TableStu.class);
        String value = tableStu.value();
        System.out.println(value);


        // 获得类指定注解
        Field f = c1.getDeclaredField("name");
        FieldStu annotation = f.getAnnotation(FieldStu.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.length());
        System.out.println(annotation.type());
    }
}

@TableStu("db_stu")
class Stu{
    @FieldStu(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FieldStu(columnName = "db_age", type = "int", length = 10)
    private int age;
    @FieldStu(columnName = "db_name", type = "varchar", length = 3)
    private String name;

    public Stu() {
    }

    public Stu(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStu{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldStu{
    String columnName();
    String type();
    int length();
}