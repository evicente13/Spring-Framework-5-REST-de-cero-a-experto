package com.devs4j.di;

import java.lang.annotation.Target;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.devs4j.di.aop.TargetObject;
import com.devs4j.di.autowired.AreaCalculatorService;
import com.devs4j.di.lifecycle.ExplicitBean;
import com.devs4j.di.lifecycle.LifeCycleBean;
import com.devs4j.di.qualifiers.Animal;
import com.devs4j.di.qualifiers.Avion;
import com.devs4j.di.qualifiers.Nido;
import com.devs4j.di.qualifiers.Pajaro;
import com.devs4j.di.qualifiers.Perro;
import com.devs4j.di.scopes.EjemploScopeService;
import com.devs4j.diprofiles.EnviromentService;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	
	//private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	@Bean
	public String getApplicationName() {
		return "!Devs4j rules!";
	}

	/*
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ExplicitBean getBean() {
		return new ExplicitBean();
	}*/
	
	public static void main(String[] args) {		
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		//LifeCycleBean bean = context.getBean(LifeCycleBean.class);
		TargetObject targetObject = context.getBean(TargetObject.class);
		targetObject.hello("Hello World");
		targetObject.foo();
	}

}
