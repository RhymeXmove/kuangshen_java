package com.shan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Dog {
    public void shot() {
        System.out.println("wo~");
    }
}
