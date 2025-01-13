package llmwebui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import llmwebui.entity.Modelo;
import llmwebui.repository.ModeloRepository;
import llmwebui.service.ModeloService;

public class ModeloServiceImpl implements ModeloService {
    @Autowired
    private ModeloRepository repository;

    @Override
    public List<Modelo> getAll() {
        return repository.findAll();
    }

    @Override
    public Modelo save(Modelo modelo) {
        return repository.save(modelo);
    }

    @Override
    public Modelo getById(long id) {
        var retorno = repository.findById(id);
        if (retorno.isPresent()) {
            return retorno.get();
        }
        return null;
    }

}
