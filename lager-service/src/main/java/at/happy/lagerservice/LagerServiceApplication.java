package at.happy.lagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LagerServiceApplication.class, args);
    }

}
