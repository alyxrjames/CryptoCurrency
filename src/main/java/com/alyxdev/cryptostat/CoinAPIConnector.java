package com.alyxdev.cryptostat;

import coinapi_sdk.java_rest.java_rest_coin_api;
        

/**
 *
 * @author Alyx
 */
public final class CoinAPIConnector {
    
    private static final String KEY = "BEA6B82A-2489-4B5F-8B28-157A627DC8A1";
    
    private java_rest_coin_api coinAPI;
    
    public CoinAPIConnector(){
        
        initConnect();
        
    }
    public void initConnect(){
       
        this.coinAPI = new java_rest_coin_api(KEY);
        
    }
    
    public java_rest_coin_api getCoinAPI(){
        
        return this.coinAPI;
        
    }
    
}
