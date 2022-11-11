package at.happy.bestellungservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HappyBestellungServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyBestellungServiceApplication.class, args);
	}

}
