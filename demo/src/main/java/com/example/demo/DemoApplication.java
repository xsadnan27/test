package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@Controller
class GreetingController{
  @GetMapping("/")
  Greet greet(){
    return new Greet("Hello World!");
  }
}
class Greet{
  private String message;
  public Greet() {}
  public Greet(String message){
    this.message = message;
  }
  //add getter and setter
}

