package br.com.zupedu.transacoes.transacao;

import javax.persistence.Embeddable;

@Embeddable
public class Cartao {
    private String numeroCartao;
    private String email;

    public Cartao(String id, String email) {
        this.numeroCartao = id;
        this.email = email;
    }

    public Cartao() {
    }
}
