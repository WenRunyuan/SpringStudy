package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.PrimitiveIterator;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void save() {
        System.out.println("book dao save..."+databaseName+", "+connectionNum);
    }
}
