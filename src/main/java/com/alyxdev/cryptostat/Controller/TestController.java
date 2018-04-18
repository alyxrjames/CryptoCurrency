/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Controller;

import com.alyxdev.cryptostat.Entity.TestEntity;
import com.alyxdev.cryptostat.Service.TestService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





/**
 *
 * @author Alyx
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;
    
    @RequestMapping("/testall")
    public ArrayList<TestEntity> getAllTestUnits(){
        return testService.getAllTestEntities();
    }
    
    @RequestMapping("/test/{id}")
    public Optional getAllTestUnit(@PathVariable int id){
        return testService.getTestEntity(id);
    }
    
    @RequestMapping(method=RequestMethod.POST,value = "/test" )
    public void addTestUnit(@RequestBody TestEntity t){
        testService.addTestEntity(t);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value = "/test/{id}" )
    public void deleteTestUnit(@RequestBody Integer id){
        testService.removeTestEntity(id);
    }
    
    @RequestMapping("/test/welcome")
    public String welcome(){
        
        return "welcome to springboot";
        
    }
    
    
}
