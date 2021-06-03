package br.com.zupedu.transacoes.transacao;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.stream.Collectors;

@RestController
public class TransacaoController {
    private final TransacaoRepository repository;

    public TransacaoController(TransacaoRepository repository) {
        this.repository = repository;
    }
    @Cacheable("transacoes")
    @GetMapping("/api/{id}/transacoes")
    public ResponseEntity<?> listarCompras(@PathVariable String id/* ,@PageableDefault(sort="efetivadaEm",direction = Sort.Direction.DESC) Pageable pageable*/){
         PageRequest pageable =  PageRequest.of(0, 10, Sort.Direction.DESC,"efetivadaEm");
         Page<Transacao> ultimasCompras= repository.findAllByCartao_NumeroCartao(id, pageable);
         return ResponseEntity.ok(ultimasCompras.getContent().stream().map(TransacaoResponse::new).collect(Collectors.toList()));
    }
}
