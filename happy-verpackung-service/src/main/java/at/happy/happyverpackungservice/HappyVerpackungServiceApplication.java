package at.happy.happyverpackungservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableEurekaClient
@EnableKafka
public class HappyVerpackungServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyVerpackungServiceApplication.class, args);
	}

}
