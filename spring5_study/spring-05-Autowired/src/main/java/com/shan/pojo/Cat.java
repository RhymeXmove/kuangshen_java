package com.shan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Cat {
    public void shot() {
        System.out.println("miao~");
    }
}
