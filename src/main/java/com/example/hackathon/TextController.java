package com.example.hackathon;
import com.example.hackathon.Clothing.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
}
