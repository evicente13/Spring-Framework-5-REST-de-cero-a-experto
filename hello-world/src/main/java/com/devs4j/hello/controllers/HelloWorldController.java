/**
 * 
 */
package com.devs4j.hello.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ET60243
 *
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public ResponseEntity<String> helloWorld(){
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
}
