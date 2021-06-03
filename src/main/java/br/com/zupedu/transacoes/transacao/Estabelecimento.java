package br.com.zupedu.transacoes.transacao;

import javax.persistence.Embeddable;

@Embeddable
public class Estabelecimento {
     String nome;
     String cidade;
     String endereco;

    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public Estabelecimento() {
    }


}
