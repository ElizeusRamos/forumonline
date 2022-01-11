package br.com.pegasus.forum.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
public class Pergunta extends AbstractEntidadeDominio {
    private String pergunta;
    @OneToOne
    private Usuario autor;
    @OneToOne
    private Assunto assunto;
    private int ptsPositivos;
    private int ptsNegativos;
    @Enumerated(EnumType.STRING)
    private StatusPerguntaEnum status;
}
