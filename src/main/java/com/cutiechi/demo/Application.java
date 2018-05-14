package com.cutiechi.demo;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动类
 *
 * @author Cutie Chi
 */
@MapperScan("com.cutiechi.demo.dao")
@SpringBootApplication
public class Application {

    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
