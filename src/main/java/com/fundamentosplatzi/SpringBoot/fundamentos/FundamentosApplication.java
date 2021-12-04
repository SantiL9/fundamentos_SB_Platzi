package com.fundamentosplatzi.SpringBoot.fundamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //clase
public class FundamentosApplication {

	//Metodo MAIN, encargado de inicializar la arquitectura y autoconfiguracion
	public static void main(String[] args) {

		SpringApplication.run(FundamentosApplication.class, args);
	}

}
