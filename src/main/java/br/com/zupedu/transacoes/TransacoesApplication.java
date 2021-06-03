package br.com.zupedu.transacoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TransacoesApplication {

	public static void main(String[] args) {

		SpringApplication.run(TransacoesApplication.class, args);

	}

}
