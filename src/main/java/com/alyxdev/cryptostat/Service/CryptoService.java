/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Service;

import com.alyxdev.cryptostat.Entity.CryptoCoinEntity;
import com.alyxdev.cryptostat.Repository.CryptoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alyx
 */
@Service
@Qualifier("cryptoService")
public class CryptoService {
    
    @Autowired
    private CryptoRepository cryptoRepository;
    
    public ArrayList<CryptoCoinEntity> getAllCryptoEntities(){
       ArrayList<CryptoCoinEntity> list = new ArrayList();
       cryptoRepository.findAll().forEach(list::add);
       return list;
    }
    
    public Optional getCryptoEntity(int id){
       return cryptoRepository.findById(id);
    }
    public void addCryptoEntity(CryptoCoinEntity t){
        cryptoRepository.save(t);
    }
    public void removeCryptoEntity(int index){
        
        cryptoRepository.deleteById(index);
        
    }
    
}
