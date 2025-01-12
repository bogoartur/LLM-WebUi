package llmwebui.service;

import java.util.List;

import llmwebui.entity.Mensagem;

public interface MensagemService {
    List<Mensagem> getAll();
    Mensagem save(Mensagem mensagem);
    Mensagem getById(long id);
}
