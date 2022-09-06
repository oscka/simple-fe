package com.example.simplefe.controller;
import java.util.List;

import com.example.simplefe.model.Simple;
import com.example.simplefe.service.SimpleService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SimpleFeController {

	private final SimpleService service;
	
	@GetMapping("/hello")
	public String hello() {		
		log.info("==========simple-fe hello()");		
		return service.hello();
		
	}
	@GetMapping("/simple")
	public List<Simple> simple(){		 
		log.info("==========simple-fe simple()");
		return service.simple();
		
	}
	
	@GetMapping("/version")
	public String version(){
		log.info("====== simple-fe  version()");
		return service.version();
		
	}

}
