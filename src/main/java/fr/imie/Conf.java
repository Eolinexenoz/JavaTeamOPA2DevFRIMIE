package fr.imie;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration
@ComponentScan
@EnableJpaRepositories
public class Conf {

	@Bean
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory("Default");
	}

	@Bean
	public Object transactionManager() {
		return new JtaTransactionManager();
	}

}
