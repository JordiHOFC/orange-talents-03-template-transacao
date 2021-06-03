package br.com.zupedu.transacoes.messagens;

public class CartaoResponseKafka {
    private String id;
    private String email;

    public CartaoResponseKafka(String id, String email) {
        this.id = id;
        this.email = email;
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
