/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Dao;

import com.alyxdev.cryptostat.Entity.TestEntity;
import java.util.Collection;
/**
 *
 * @author Alyx
 */
public interface TestDao {
    
    Collection<TestEntity> getAllTestEntities();
    
    TestEntity getTestEntityById(int id);
    
    void removeTestEntityById(int id);
    
    void updateTestEntityById(int id);
    
    void insertTestEntityById(int id);
    
}
