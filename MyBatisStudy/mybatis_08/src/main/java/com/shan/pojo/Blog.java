package com.shan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date create_time;
    private int views;
}
