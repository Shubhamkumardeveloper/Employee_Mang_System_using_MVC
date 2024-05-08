package com.ty.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.ty")
public class EmployeeBeanConfigurtation {
	
	@Bean(value = "entityManager")
	@Scope(value = "prototype")
	public EntityManager entityManger() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}

}
