package br.com.pegasus.forum.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class Assunto extends AbstractEntidadeDominio {
    @Column(nullable = false, length = 50, unique = true, updatable = false)
    private String descricao;
}
