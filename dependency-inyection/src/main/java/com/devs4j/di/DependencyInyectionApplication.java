package com.devs4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.devs4j.di.qualifiers.Animal;
import com.devs4j.di.qualifiers.Avion;
import com.devs4j.di.qualifiers.Nido;
import com.devs4j.di.qualifiers.Pajaro;
import com.devs4j.di.qualifiers.Perro;
import com.devs4j.diprofiles.EnviromentService;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);


	public static void main(String[] args) {
		//SpringApplication.run(DependencyInyectionApplication.class, args);
		
		//Motor motor = new Motor("Xl1", 1981);
		//Coche coche = new Coche("VW", 1986, motor);
		
		//System.out.println(coche);
		
		//Inyeccion de Dependencias por atributo
		
		//Perro perro = context.getBean(Perro.class);
		//Pajaro pajaro = context.getBean(Pajaro.class);
		//Avion avion = context.getBean(Avion.class);
		
		//Animal animal = context.getBean("perro", Animal.class);
		//log.info("Animal nombre = {} edad = {}", animal.getNombre(), animal.getEdad());
		
		//Nido nido = context.getBean(Nido.class);
		//nido.imprimir();
		
		ConfigurableApplicationContext context =  SpringApplication.run(DependencyInyectionApplication.class, args);
		
		EnviromentService enviromentService = context.getBean(EnviromentService.class);
		
		log.info("Active enviroment {}", enviromentService.getEnviroment());
		
		
	}

}
