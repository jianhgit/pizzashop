package com.example.pizzashopapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class PizzaShopApiApplication {

	@RequestMapping("/pizzas")
	String home() {
		return "Welcome to the Pizza Shop!";
	}

	public static void main(String[] args) {
		SpringApplication.run(PizzaShopApiApplication.class, args);
	}
}

