package com.annotation.demo01;

import java.lang.annotation.*;

//测试元注解
public class Test02 {
    @MyAnnotation
    public static void main(String[] args) {

    }

    // 注解可以显示赋值 如果没有默认值，就必须给注解赋值
    @MyAnnotation(name = "shan", age = 24)
    public void test(){
    }
}


//定义一个注解
//Target表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//Retention 表示我们的注解在什么地方还有效
//Runtime > class > source
@Retention(RetentionPolicy.RUNTIME)
//@Documented 表示是否将我们的注解生成在JAVADoc中
@Documented
//@Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation {
    // 注解的参数 ：参数类型 + 参数名（）
    // String value(); 此时上面的引用可以不需要 value = "xxx"
    String name() default "";
    int age() default 0;
    int id() default -1;// 如果默认值为-1，代表不存在

    String[] schoold() default "TshinghuaU";
}