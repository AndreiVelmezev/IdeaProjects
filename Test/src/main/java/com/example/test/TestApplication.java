package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        var a =2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 %;
        System.out.println(a);
    }

}
