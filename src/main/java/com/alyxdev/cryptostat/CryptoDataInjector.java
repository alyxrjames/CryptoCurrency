/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat;

import coinapi_sdk.java_rest.java_rest_coin_api;
import coinapi_sdk.java_rest.java_rest_coin_api.asset;
import com.alyxdev.cryptostat.Entity.CryptoCoinEntity;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alyx
 */
@Component
public class CryptoDataInjector {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://alyxdev.czcdgqfkwsnr.us-east-2.rds.amazonaws.com:3306/CryptoCurrency";
    static final String USER = "alyxrjames";
    static final String PASS = "Sinful77";
    
    private Connection conn;
    private Statement stmt ;
    
    public CryptoDataInjector(){
        
       
        
        
    }
    
    @Scheduled(fixedDelay = 300000 , initialDelay = 1000)
    public void assetInject() throws java_rest_coin_api.exception, ClassNotFoundException{
        
        CryptoDataExtractor extract = new CryptoDataExtractor();
        
        ArrayList<asset> assetList = extract.assetExtractor();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            this.conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            
            this.stmt = (Statement) conn.createStatement();
            
            Integer count = 1;
            
            for(asset a : assetList){
                
                Integer is_crypto = a.is_type_crypto() ? 1 : 0;
                
                String sql = 
                        "INSERT INTO cryptofeed " +
                        "VALUES("+count+","+"'"+a.get_asset_id()+"'"+","+"'"+a.get_name()+"'"+","+"'"+is_crypto+"'"+
                        ","+"'Temp1'"+","+"'Temp2'"+","+"'Temp3'"+","+"'Temp4'"+","+"'Temp5'"+","+"'Temp6'"+","+"'Temp7'"+","+"'Temp8'"+","+ 1 + ","+ 1 +")";
                
                stmt.executeUpdate(sql);
                
                count++;
            
            }        
            
        }
        catch(SQLException se){
            
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(stmt!=null)
                    conn.close();
            }
            catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }
            catch(SQLException se){
                 se.printStackTrace();
            }
        }
  
        
    }
    
}
