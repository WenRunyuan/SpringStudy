package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.PrimitiveIterator;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    public void save() {
        System.out.println("book dao save..."+connectionNum+" , "+databaseName);
    }
}
