package mx.uacm.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("mx.uacm.curso.daos")
@EntityScan("mx.uacm.curso.entidades")
@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringApplication.class, args);
	}

}
