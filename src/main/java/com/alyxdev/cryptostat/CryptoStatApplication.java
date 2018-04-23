package com.alyxdev.cryptostat;

import coinapi_sdk.java_rest.java_rest_coin_api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@Configuration
@EnableScheduling
public class CryptoStatApplication {

	public static void main(String[] args) throws java_rest_coin_api.exception {
		SpringApplication.run(CryptoStatApplication.class, args);
                
               
	}
        public void myfunc(){
            
            
            
        }
}
