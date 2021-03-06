package br.com.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcessoController {

    @Autowired
    private AcessoProducer acessoProducer;

    @PostMapping
    public void sendLivro(@RequestBody Acesso acesso) {
        acessoProducer.enviarAoKafka(acesso);
    }



}
