package llmwebui.service;

import java.util.List;

import llmwebui.entity.Modelo;

public interface ModeloService {
    List<Modelo> getAll();

    Modelo save(Modelo modelo);

    Modelo getById(long id);
}