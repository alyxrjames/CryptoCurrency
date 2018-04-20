/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat;

import coinapi_sdk.java_rest.java_rest_coin_api;
import coinapi_sdk.java_rest.java_rest_coin_api.asset;
import java.util.ArrayList;

/**
 *
 * @author Alyx
 */
public class CryptoDataExtractor {
    
    private final CoinAPIConnector connection;
    
    private final java_rest_coin_api feed;
    
    public CryptoDataExtractor() {
        
        this.connection = new CoinAPIConnector();
        
        this.feed = connection.getCoinAPI();
        
    }
    
    public ArrayList<asset> assetExtractor() throws java_rest_coin_api.exception{
        
        ArrayList<asset> assetList = new ArrayList();
        
        asset[] assets = feed.list_all_assets();
        
        for(asset a: assets){
            
            assetList.add(a);
            
        }
        
        return assetList;
        
    }
    
    /*Make a plan for additional extractions*/
    public void symbolExtractor(){
        
    }
    
    public void printAssets() throws java_rest_coin_api.exception{
        
        ArrayList<asset> printL = assetExtractor();
        
        for(asset a : printL){
            
            System.out.println("ASSET ID:" + a.get_asset_id());
            System.out.println("ASSET NAME:" + a.get_name());
            System.out.println("ASSET IS_CRYPTO:" + a.is_type_crypto());
            System.out.println();
            
        }
        
    }
    
}
