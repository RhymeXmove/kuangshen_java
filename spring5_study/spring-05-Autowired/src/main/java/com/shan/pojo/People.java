package com.shan.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class People {
    public void shot() {
        System.out.println("I CAN");
    }

    //如果显式定义了Autowird 的 required 属性为 false， 说明这个对象可以为null，否则不允许为空；
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

}
