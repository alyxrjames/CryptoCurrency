package com.alyxdev.cryptostat;

import coinapi_sdk.java_rest.java_rest_coin_api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({"com.alyxdev.cryptostat.*"})
@EntityScan("com.alyxdev.cryptostat.Entity")
public class CryptoStatApplication {

	public static void main(String[] args) throws java_rest_coin_api.exception {
		SpringApplication.run(CryptoStatApplication.class, args);
                
               
	}
        public void myfunc(){
            
            
            
        }
}
