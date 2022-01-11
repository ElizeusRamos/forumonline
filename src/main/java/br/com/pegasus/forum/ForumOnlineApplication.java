package br.com.pegasus.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ForumOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumOnlineApplication.class, args);
	}

}
