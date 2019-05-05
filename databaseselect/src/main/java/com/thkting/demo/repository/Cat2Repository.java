package com.thkting.demo.repository;

import com.thkting.demo.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface Cat2Repository extends Repository<Cat,Integer> {
    public Cat findCatByCatName(String catName);

    /**
     *  通过JPQL语句来进行操作
     */

    @Query("from Cat where catName=:cn")
    public Cat getCatByCatName(@Param("cn") String catName);
}