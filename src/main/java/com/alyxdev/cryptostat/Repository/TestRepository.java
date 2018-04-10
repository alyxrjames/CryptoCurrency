/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Repository;

import com.alyxdev.cryptostat.Entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alyx
 */
public interface TestRepository extends CrudRepository<TestEntity,Integer> {
    

    
}
