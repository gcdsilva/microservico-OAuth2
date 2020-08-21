package br.com.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AcessoProducer {

    @Autowired
    private KafkaTemplate<String, Acesso> producer;

    public void enviarAoKafka(Acesso acesso) {
//        for (int i = 0; i < 40; i++) {
//            producer.send("spec4-biblioteca", i, "1", livro);
//        }
        producer.send("spec4-guilherme-cabral-1", acesso);
    }

}
