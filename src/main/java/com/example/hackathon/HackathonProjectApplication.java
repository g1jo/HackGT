package com.example.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;


@SpringBootApplication
public class HackathonProjectApplication {

    public static void main(String[] args) throws SQLException {
//        DataSource source = CloudSqlConnectionPoolFactory.createConnectionPool();

        SpringApplication.run(HackathonProjectApplication.class, args);
        DataSource dataSource = CloudSqlConnectionPoolFactory.createConnectionPool();

        // Run a query and get the result
        ResultSet rs =
                dataSource.getConnection().prepareStatement("SELECT * FROM clothing").executeQuery();

        // print the results to the console
        while (rs.next()) {
            System.out
                    .println(rs.getString(1));
        }
    }

}
