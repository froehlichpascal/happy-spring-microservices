package at.happy.happyapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HappyApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyApiGatewayApplication.class, args);
	}

}
