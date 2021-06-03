package br.com.zupedu.transacoes.messagens;

import br.com.zupedu.transacoes.transacao.Estabelecimento;

public class EstabelecimentoResponseKafka {
    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoResponseKafka(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }
    @Deprecated
    public EstabelecimentoResponseKafka() {
    }

    public Estabelecimento paraEstabelecimento(){
        return new Estabelecimento(nome,cidade,endereco);
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "EstabelecimentoResponseKafka{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
