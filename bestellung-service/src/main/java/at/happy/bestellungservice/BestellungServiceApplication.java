package at.happy.bestellungservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BestellungServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestellungServiceApplication.class, args);
	}

}
