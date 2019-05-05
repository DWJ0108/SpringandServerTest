package com.thkting.demo.contronller;

import com.thkting.demo.bean.Cat;
import com.thkting.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cat")
public class CatController {
    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatAge(11);
        cat.setCatName("短尾猫");
        catService.save(cat);
        return "save ok";
    }

    @RequestMapping("/delete")
    public String delete(){
        catService.delete(1);
        return "delete ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }
    @RequestMapping("/findByCatName")
    public Cat findByCatName(String catName){
        return catService.findByCatName(catName);
    }

    @RequestMapping("/getCatByCatName")
    public Cat getCatByCatName(String catName){
        return catService.getCatByCatName(catName);
    }

    @RequestMapping("/selectByCatName")
    public Cat selectByCatName(String catName){
        return catService.selectByCatName();
    }
}
