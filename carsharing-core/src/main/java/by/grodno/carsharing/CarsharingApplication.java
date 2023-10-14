package by.grodno.carsharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "by.grodno.carsharing")
public class CarsharingApplication {
	public static void main(String[] args) {
		SpringApplication.run(CarsharingApplication.class, args);
	}
}
