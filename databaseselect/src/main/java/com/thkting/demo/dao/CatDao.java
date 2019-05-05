package com.thkting.demo.dao;

import com.thkting.demo.bean.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class CatDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat selectByCatName(){
        /**
         * 定义一个sql语句
         * 定义一个ROWMAP
         * 执行查询呢方法
         */
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<Cat>(Cat.class);
        String sql = "select * from cat where cat_name=?";
        Cat cat = jdbcTemplate.queryForObject(sql,rowMapper);
        return cat;
    }
}
