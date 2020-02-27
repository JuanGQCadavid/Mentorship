package com.example.demo;

import com.example.demo.carlos.Prueba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "I refuse to do brew coffee ")
	@RequestMapping(value = "/teat", method = RequestMethod.GET)
	public String teat(){
		//ResponseEntity<String>
		return "Hi Carlos";
	}

	// Recursos -> REST
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name") String name){
		return String.format("Hello %s!", name);
	}


	@PostMapping("/hello")
	public String helloPost(@RequestBody Prueba prueba){
		System.out.println(prueba);
		return String.format("Done");
	}


}
