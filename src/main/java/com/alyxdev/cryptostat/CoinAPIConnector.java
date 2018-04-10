package com.alyxdev.cryptostat;

import coinapi_sdk.java_rest.java_rest_coin_api;
        

/**
 *
 * @author Alyx
 */
public class CoinAPIConnector {
    
    public CoinAPIConnector(){
        
    }
    public void initConnect(){
       
        java_rest_coin_api connect = new java_rest_coin_api("BEA6B82A-2489-4B5F-8B28-157A627DC8A1");
        
    }
    
}
