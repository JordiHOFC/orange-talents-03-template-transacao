package br.com.zupedu.transacoes.messagens;

import br.com.zupedu.transacoes.messagens.CartaoResponseKafka;
import br.com.zupedu.transacoes.messagens.EstabelecimentoResponseKafka;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponseKafka {
    private String id;
    private BigDecimal valor;
    private EstabelecimentoResponseKafka estabelecimento;
    private CartaoResponseKafka cartao;
    private LocalDateTime efetivadaEm;

    public TransacaoResponseKafka(String id, BigDecimal valor, EstabelecimentoResponseKafka estabelecimento, CartaoResponseKafka cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public TransacaoResponseKafka() {
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponseKafka getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponseKafka getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransacaoResponseKafka{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
