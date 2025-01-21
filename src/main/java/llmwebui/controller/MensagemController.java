package llmwebui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import llmwebui.entity.Mensagem;
import llmwebui.repository.MensagemRepository;
import llmwebui.service.MensagemService;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/mensagem")
public class MensagemController {
    @Autowired
    private MensagemService service;

    @Autowired
    private MensagemRepository repository;

    @GetMapping
    public ResponseEntity<List<Mensagem>> getAllMensagens() {
        List<Mensagem> listaMensagens = service.getAll();
        return ResponseEntity.ok(listaMensagens);
    }

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody Mensagem mensagem) {
        mensagem.setRemetente(true); // true pq se passou por esse metodo, é do usuario, mensagens do bot virao da
                                     // API do ollama em outra funcao
        repository.save(mensagem);
        System.out.println("Mensagem enviada: " + mensagem.getConteudo().toString());
        return new ResponseEntity<>(mensagem.getConteudo(), HttpStatus.OK);
    }

}
