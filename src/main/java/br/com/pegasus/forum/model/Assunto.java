package br.com.pegasus.forum.model;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Builder
@Entity
@Getter
public class Assunto extends EntidadeDominio {
    @Column(nullable = false, length = 50, unique = true, updatable = false)
    private String descricao;
}
