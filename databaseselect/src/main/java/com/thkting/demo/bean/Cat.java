package com.thkting.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 使用进行持久化操作，当JPA检测到实体类当中有这个注解的时候会在数据库中生成对
 * 应的表结构信息
 */
@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;// 主键
    private String catName;
    private int catAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

}
