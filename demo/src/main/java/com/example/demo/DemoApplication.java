package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

   int []a =new int[]{4,5,6,7,8};
        int []b=new int[a.length];
        for (int i = 0;i<a.length;++i){
            b[i]=a[i]*2;

        }
    }

}
