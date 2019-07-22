package com.palaciossystems.circuitbreaker.paytm.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/paymentService")
public class PaytmApplication {
	
	@GetMapping("/pay")
	public String payNow() {
		return "Pay called!!!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(PaytmApplication.class, args);
	}

}
