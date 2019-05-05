package com.thkting.demo.service;

import com.thkting.demo.bean.Cat;
import com.thkting.demo.dao.CatDao;
import com.thkting.demo.repository.Cat2Repository;
import com.thkting.demo.repository.CatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class CatService {
    @Resource
    private CatRepository catRepository;

    @Resource
    private Cat2Repository cat2Repository;

    private CatDao catDao;

    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }

    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }

    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }

    public Cat findByCatName(String catName){
        return cat2Repository.findCatByCatName(catName);
    }

    public Cat getCatByCatName(String catName){
        return cat2Repository.getCatByCatName(catName);
    }

    public Cat selectByCatName(){
        return catDao.selectByCatName();
    }
}
