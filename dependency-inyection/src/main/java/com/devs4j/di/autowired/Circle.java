package com.devs4j.di.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure{
	
	@Value("${circle.radius}")
	private double radius;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	}

}
