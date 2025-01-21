package llmwebui.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import llmwebui.entity.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
    List<Mensagem> findByRemetenteOrderByEnviadoEmDesc(boolean remetente);
}
