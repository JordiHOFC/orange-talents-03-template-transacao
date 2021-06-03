package br.com.zupedu.transacoes.transacao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {
    @JsonProperty
    private String id;
    @JsonProperty
    private BigDecimal valor;
    @JsonProperty
    private EstabelecimentoResponse estabelecimento;
    @JsonProperty
    @JsonFormat(pattern = "dd/MM/yyy HH:mm")
    private LocalDateTime efetivadoEm;

    public TransacaoResponse(Transacao transacao) {
        this.id=transacao.getId();
        this.valor=transacao.getValor();
        this.estabelecimento=new EstabelecimentoResponse(transacao.getEstabelecimento());
        this.efetivadoEm=transacao.getEfetivadaEm();
    }
}
