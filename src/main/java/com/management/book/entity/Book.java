package com.management.book.entity;

import lombok.Data;

@Data
public class Book {
    /**主键*/
    private Integer id;
    /**书名*/
    private String name;
    /**作者*/
    private String writer;
    /**类型*/
    private String type;
}
