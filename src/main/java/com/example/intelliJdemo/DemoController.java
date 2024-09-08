package com.example.intelliJdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${database.url}")
    private String dbUrl;

    @Value("${database.username}")
    private String dbUsername;

    @Value("${database.password}")
    private String dbPassword;

    @GetMapping("/dbinfo")
    public String getDatabaseInfo() {
        // 印出不同環境的資料庫連線資訊
        System.out.println("DB URL: " + dbUrl);
        System.out.println("DB Username: " + dbUsername);
        System.out.println("DB Password: " + dbPassword);

        return "Database Connection Info: \n"
                + "URL: " + dbUrl + "\n"
                + "Username: " + dbUsername + "\n"
                + "Password: " + dbPassword;
    }
}
