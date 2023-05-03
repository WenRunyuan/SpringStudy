package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;
    public void save() {
        System.out.println("book dao save..." + name);
    }
}
