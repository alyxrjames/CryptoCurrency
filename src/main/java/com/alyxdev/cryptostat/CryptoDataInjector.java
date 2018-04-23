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
import java.sql.PreparedStatement;
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
    private PreparedStatement stmt;
    
    public CryptoDataInjector(){
        
       
        
        
    }
    
    @Scheduled(fixedDelay = 300000 , initialDelay = 1000)
    public void assetInject() throws java_rest_coin_api.exception, ClassNotFoundException{
        
        CryptoDataExtractor extract = new CryptoDataExtractor();
        
        ArrayList<asset> assetList = extract.assetExtractor();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            this.conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            
            this.stmt =   conn.prepareStatement("insert into cryptofeed "
                    + "(asset_id,asset_name,asset_is_crypto,data_start,data_end"
                    + ",data_quote_start,data_quote_end,data_orderbook_start"
                    + ",data_orderbook_end, data_trade_start, data_trade_end"
                    + ",data_trade_count, data_symbols_count) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            Integer count = 1;
            
            for(asset a : assetList){
                
                Integer is_crypto = a.is_type_crypto() ? 1 : 0;
                
                
                stmt.setString(1,a.get_asset_id());
                stmt.setString(2,a.get_name());
                stmt.setInt(3, is_crypto);
                stmt.setString(4, "Temp1");
                stmt.setString(5, "Temp2");
                stmt.setString(6, "Temp3");
                stmt.setString(7, "Temp4");
                stmt.setString(8, "Temp5");
                stmt.setString(9, "Temp6");
                stmt.setString(10, "Temp7");
                stmt.setString(11, "Temp8");
                stmt.setInt(12, 1);
                stmt.setInt(13, 1);
                
                stmt.executeUpdate();
                
                
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
