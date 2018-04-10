/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.cryptostat.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Alyx
 */
@Entity
public class TestEntity implements Serializable {
    
    @Id
    private int id;
    private String p1;
    private String p2;
    private String p3;

    public TestEntity() {
    }
    
    public TestEntity(int id, String p1, String p2, String p3){
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    
    
}
