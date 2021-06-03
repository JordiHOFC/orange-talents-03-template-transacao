package br.com.zupedu.transacoes.messagens;

import br.com.zupedu.transacoes.transacao.Cartao;

public class CartaoResponseKafka {
    private String id;
    private String email;

    public CartaoResponseKafka(String id, String email) {
        this.id = id;
        this.email = email;
    }
    public Cartao paraCartao(){
        return new Cartao(id,email);
    }

    public CartaoResponseKafka() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CartaoResponseKafka{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
