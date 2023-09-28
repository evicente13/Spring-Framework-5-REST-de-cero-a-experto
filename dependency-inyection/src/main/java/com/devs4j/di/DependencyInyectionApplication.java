package com.devs4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.devs4j.di.autowired.AreaCalculatorService;
import com.devs4j.di.qualifiers.Animal;
import com.devs4j.di.qualifiers.Avion;
import com.devs4j.di.qualifiers.Nido;
import com.devs4j.di.qualifiers.Pajaro;
import com.devs4j.di.qualifiers.Perro;
import com.devs4j.di.scopes.EjemploScopeService;
import com.devs4j.diprofiles.EnviromentService;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	@Bean
	public String getApplicationName() {
		return "!Devs4j rules!";
	}

	public static void main(String[] args) {		
		ConfigurableApplicationContext context =  SpringApplication.run(DependencyInyectionApplication.class, args);
		
		AreaCalculatorService calculator = context.getBean(AreaCalculatorService.class);
		
		log.info("Area Total {}", calculator.calcAres());
		
	}

}
