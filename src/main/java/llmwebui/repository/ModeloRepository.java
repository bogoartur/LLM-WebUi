package llmwebui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import llmwebui.entity.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}
