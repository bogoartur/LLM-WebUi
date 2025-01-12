package llmwebui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import llmwebui.entity.Mensagem;
import llmwebui.service.MensagemService;

@Controller
@RequestMapping("/api/mensagem")
public class MensagemController {
    @Autowired
    private MensagemService service;

    @GetMapping
    public ResponseEntity<List<Mensagem>> getAllMensagens() {
        List<Mensagem> listaMensagens = service.getAll();
        return ResponseEntity.ok(listaMensagens);
    }
}
