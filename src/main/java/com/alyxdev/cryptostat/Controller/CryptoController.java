/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Controller;

import com.alyxdev.cryptostat.Entity.CryptoCoinEntity;
import com.alyxdev.cryptostat.Service.CryptoService;
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
public class CryptoController{

    @Autowired
    private CryptoService cryptoService;
    
    @RequestMapping("/cryptofeed")
    public ArrayList<CryptoCoinEntity> getAllCryptoCurrencies(){
        return cryptoService.getAllCryptoEntities();
    }
    
    @RequestMapping("/crypto/{id}")
    public Optional getCryptoUnit(@PathVariable int id){
        return cryptoService.getCryptoEntity(id);
    }
    
    @RequestMapping(method=RequestMethod.POST,value = "/crypto" )
    public void addCryptoUnit(@RequestBody CryptoCoinEntity t){
        cryptoService.addCryptoEntity(t);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value = "/crypto/{id}" )
    public void deleteTestUnit(@RequestBody Integer id){
        cryptoService.removeCryptoEntity(id);
    }
    @Override
    public String toString() {
        return "com.alyxdev.cryptostat.Controller.CryptoController[ id=" + " ]";
    }
    
}
