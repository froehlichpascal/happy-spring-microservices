package at.happy.happyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HappyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyEurekaServerApplication.class, args);
	}

}
