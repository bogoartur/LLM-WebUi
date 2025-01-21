package llmwebui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import llmwebui.entity.Mensagem;
import llmwebui.repository.MensagemRepository;
import llmwebui.service.MensagemService;

@Service
public class MensagemServiceImpl implements MensagemService {
    @Autowired
    private MensagemRepository repository;

    @Override
    public List<Mensagem> getAll() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "enviadoEm"));
    }

    @Override
    public Mensagem save(Mensagem mensagem) {
        return repository.save(mensagem);
    }

    @Override
    public Mensagem getById(long id) {
        var retorno = repository.findById(id);
        if (retorno.isPresent()) {
            return retorno.get();
        }
        return null;
    }

}
