/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Alyx
 */
@Entity
@Table(name = "cryptofeed")
public class CryptoCoinEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "asset_id")
    private String asset_id;  
    
    @Column(name = "asset_name")
    private String asset_name;
    
    @Column(name = "asset_is_crypto")
    private Integer is_crypto;
    
    @Column(name = "data_start")
    private String data_start;
    
    @Column(name = "data_end")
    private String data_end;
    
    @Column(name = "data_quote_start")
    private String data_quote_start;
    
    @Column(name = "data_quote_end")
    private String data_quote_end;
    
    @Column(name = "data_orderbook_start")
    private String data_orderbook_start;
    
    @Column(name = "data_orderbook_end")
    private String data_orderbook_end;
   
    @Column(name = "data_trade_start")
    private String data_trade_start;
    
    @Column(name = "data_trade_end")
    private String data_trade_end;
    
    @Column(name = "data_trade_count")
    private Integer data_trade_count;
    
    @Column(name = "data_symbols_count")
    private Integer data_symbols_count;
    

    public CryptoCoinEntity(Integer id, String asset_id, String asset_name, Integer is_crypto, String data_start, String data_end, String data_quote_start, String data_quote_end, String data_orderbook_start, String data_orderbook_end, String data_trade_start, String data_trade_end, Integer data_trade_count, Integer data_symbols_count) {
        this.id = id;
        this.asset_id = asset_id;
        this.asset_name = asset_name;
        this.is_crypto = is_crypto;
        this.data_start = data_start;
        this.data_end = data_end;
        this.data_quote_start = data_quote_start;
        this.data_quote_end = data_quote_end;
        this.data_orderbook_start = data_orderbook_start;
        this.data_orderbook_end = data_orderbook_end;
        this.data_trade_start = data_trade_start;
        this.data_trade_end = data_trade_end;
        this.data_trade_count = data_trade_count;
        this.data_symbols_count = data_symbols_count;
    }

    public Integer getId() {
        return id;
    }

    public String getAsset_id() {
        return asset_id;
    }

    public String getAsset_name() {
        return asset_name;
    }

    public Integer getIs_crypto() {
        return is_crypto;
    }

    public String getData_start() {
        return data_start;
    }

    public String getData_end() {
        return data_end;
    }

    public String getData_quote_start() {
        return data_quote_start;
    }

    public String getData_quote_end() {
        return data_quote_end;
    }

    public String getData_orderbook_start() {
        return data_orderbook_start;
    }

    public String getData_orderbook_end() {
        return data_orderbook_end;
    }

    public String getData_trade_start() {
        return data_trade_start;
    }

    public String getData_trade_end() {
        return data_trade_end;
    }

    public Integer getData_trade_count() {
        return data_trade_count;
    }

    public Integer getData_symbols_count() {
        return data_symbols_count;
    }
    

    
    
    
    
}
