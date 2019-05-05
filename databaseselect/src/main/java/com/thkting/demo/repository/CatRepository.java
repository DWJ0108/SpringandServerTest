package com.thkting.demo.repository;

import com.thkting.demo.bean.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat,Integer> {
}