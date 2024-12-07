package com.mall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @author karywoodOyo
 */
@EnableAdminServer
@SpringBootApplication
public class MonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MonitorApplication.class, args);
        System.out.println("\033[0;32m"+"MonitorApplication started!"+"\033[0m");
    }
}