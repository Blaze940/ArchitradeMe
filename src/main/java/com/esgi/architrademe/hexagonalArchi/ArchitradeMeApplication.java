package com.esgi.architrademe.hexagonalArchi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Import({ApplicationConfiguration.class})
@EntityScan("com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity")
@EnableJpaRepositories(basePackages = "com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.repository")
@SpringBootApplication(scanBasePackages = "com.esgi.architrademe.hexagonalArchi")
//@SpringBootApplication
public class ArchitradeMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchitradeMeApplication.class, args);
	}

}
