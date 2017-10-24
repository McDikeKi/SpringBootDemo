package org.harvey.springbootdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContorller {
	Logger log = Logger.getLogger(HelloWorldContorller.class);
	
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
