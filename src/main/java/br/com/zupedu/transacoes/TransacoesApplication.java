package br.com.zupedu.transacoes;

import br.com.zupedu.transacoes.transacao.TransacaoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TransacoesApplication {

	public static void main(String[] args) {

		final ConfigurableApplicationContext ctx = SpringApplication.run(TransacoesApplication.class, args);
		final TransacaoRepository repository = ctx.getBean(TransacaoRepository.class);
		repository.findAll().forEach(System.out::println);
	}

}
