package br.com.zupedu.transacoes.transacao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstabelecimentoResponse {
    @JsonProperty
    private String nome;
    @JsonProperty
    private String cidade;
    @JsonProperty
    private String endereco;


    public EstabelecimentoResponse(Estabelecimento estabelecimento) {
        this.nome=estabelecimento.nome;
        this.endereco=estabelecimento.endereco;
        this.cidade= estabelecimento.cidade;
    }
}
