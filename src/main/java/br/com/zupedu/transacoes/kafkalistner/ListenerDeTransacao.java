package br.com.zupedu.transacoes.kafkalistner;

import br.com.zupedu.transacoes.messagens.TransacaoResponseKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoResponseKafka eventoDeTransacao) {
        System.out.println(eventoDeTransacao);
    }

}
