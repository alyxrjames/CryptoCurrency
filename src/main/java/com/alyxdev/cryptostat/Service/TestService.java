/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Service;

import com.alyxdev.cryptostat.Entity.TestEntity;
import com.alyxdev.cryptostat.Repository.TestRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Alyx
 */
public class TestService {
    
    @Autowired
    private TestRepository testRepository;
    
    private ArrayList<TestEntity> testList;
    
    public ArrayList<TestEntity> getAllTestEntities(){
       ArrayList<TestEntity> list = new ArrayList();
       testRepository.findAll().forEach(list::add);
       return list;
    }
    
    public Optional getTestEntity(int id){
       return testRepository.findById(id);
    }
    public void addTestEntity(TestEntity t){
        testRepository.save(t);
    }
    public void removeTestEntity(int index){
        
        testRepository.deleteById(index);
        
    }
    
}
