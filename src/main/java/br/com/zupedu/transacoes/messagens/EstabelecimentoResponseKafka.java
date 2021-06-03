package br.com.zupedu.transacoes.messagens;

public class EstabelecimentoResponseKafka {
    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoResponseKafka(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public EstabelecimentoResponseKafka() {
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
