package com.example.hackathon;
import com.example.hackathon.Clothing.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TextController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    Shirt item = new Shirt(1, 70, "red");

    @GetMapping
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return item.getColor();
}

    @GetMapping("/clothing")
    public void greeting() throws SQLException {
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
