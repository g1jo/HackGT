package com.example.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HackathonProjectApplication {

    public static void main(String[] args) {
//        DataSource source = CloudSqlConnectionPoolFactory.createConnectionPool();

        SpringApplication.run(HackathonProjectApplication.class, args);
    }

}
