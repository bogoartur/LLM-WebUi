package llmwebui.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(nullable = false)
    private String conteudo;

    @Override
    public String toString() {
        return conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Column(name = "enviada_em", nullable = false)
    private LocalDateTime enviadoEm;

    @PrePersist
    public void prePersist() {
        if (enviadoEm == null) {
            enviadoEm = LocalDateTime.now();
        }
    }

    public LocalDateTime getEnviadoEm() {
        return enviadoEm;
    }

    public void setEnviadoEm(LocalDateTime enviadoEm) {
        this.enviadoEm = enviadoEm;
    }

    @Column(nullable = false)
    private boolean remetente; // boolean pq se for mensagem do usuario, é true, se for do bot, é false

    public boolean isRemetente() {
        return remetente;
    }

    public void setRemetente(boolean remetente) {
        this.remetente = remetente;
    }
}
