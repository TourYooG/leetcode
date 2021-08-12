package com.gcy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class,
        MongoAutoConfiguration.class,
        MongoDataAutoConfiguration.class}) //排除bean加载，提高性能。//同时禁止自动配置，防止无法连接mongo而导致boot启动失败。
@ComponentScan
public class Start {


    public static void main(String[] args) {

        SpringApplication.run(Start.class, args);

    }
}

