package com.code.cars.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.cars.collection.CarsCollection;

@Controller

public class MainController {

	

	@Autowired

	private CarsCollection theCarCollection;
	// ArrayListCar arrayListCar;

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}

	@GetMapping("/traficSimulate")
	public String traficSimulate() {
		return "trafic-simulate";
	}

	@GetMapping("/clearList")
	public String clearList() {

		theCarCollection.clearCarsList();
		System.out.println("ilosc aut po czyszczeniu: " + theCarCollection.getQuantityCars());

		return "clear-list";

	}
}
