package com.devs4j.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototipe") ---- Recordemos que predestroy no se ejecuta para beas de tipo prototype 
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean{

	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
		log.info("Bean name {}", name);
	}

	//Se ejecuta despues de la inyeccion de dependencias
	@PostConstruct
	public void init() {
		log.info("Post Construct");
	}
	
	//Se ejecutara antes de que el bean sea destruido
	//No se ejecuta para beas prototype
	//Solo se ejecutan durante una terminacion de la VM de forma normal
	@PreDestroy
	public void destroyBean() {
		log.info("Pre Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
