/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Repository;

import com.alyxdev.cryptostat.Entity.CryptoCoinEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alyx
 */
@Repository
public interface CryptoRepository extends CrudRepository<CryptoCoinEntity,Integer> {
    
}
