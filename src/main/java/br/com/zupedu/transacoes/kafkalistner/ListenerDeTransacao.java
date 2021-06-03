package br.com.zupedu.transacoes.kafkalistner;

import br.com.zupedu.transacoes.messagens.TransacaoResponseKafka;
import br.com.zupedu.transacoes.transacao.Transacao;
import br.com.zupedu.transacoes.transacao.TransacaoRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    private final TransacaoRepository repository;

    public ListenerDeTransacao(TransacaoRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoResponseKafka eventoDeTransacao) {
        Transacao transacao = eventoDeTransacao.paraTransacao();
        repository.save(transacao);
        System.out.println(eventoDeTransacao);
    }

}
