/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat;

import coinapi_sdk.java_rest.java_rest_coin_api;
import coinapi_sdk.java_rest.java_rest_coin_api.asset;
import com.alyxdev.cryptostat.Entity.CryptoCoinEntity;
import java.util.ArrayList;

/**
 *
 * @author Alyx
 */
public class CryptoDataInjector {
    
    public CryptoDataInjector(){
        
       
        
        
    }
    
    public ArrayList<CryptoCoinEntity> assetInject() throws java_rest_coin_api.exception{
        
        CryptoDataExtractor extract = new CryptoDataExtractor();
        
        ArrayList<asset> assetList = extract.assetExtractor();
        
        ArrayList<CryptoCoinEntity> entities = new ArrayList();
        
        Integer count = 1;
        
        for(asset a : assetList){
            
             Integer isCrypto;
             
             if(a.is_type_crypto()){
                 
                 isCrypto = 1;
             }
             else{
                 isCrypto = 0;
             }
            
             CryptoCoinEntity coinEntity = new CryptoCoinEntity(count,a.get_asset_id(),a.get_name(),isCrypto,"","","","","","","","",1,1);
             
             entities.add(coinEntity);
             
             count++;
            
        }
        
        return entities;
        
    }
    
    /*THE PLAN IS TO INSERT THE ASSETINJECTION ARRAY INTO THE DATABASE EITHER USE AWS OR JDBCONNECTOR*/
    
}
