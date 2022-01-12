package br.com.pegasus.forum.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Builder
@Entity
@Setter
@Getter
public class Usuario extends EntidadeDominio {
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String senha;
    private String nome;
    private String descricaoBio;
    @Enumerated(EnumType.STRING)
    private StatusAtividadeEnum status;
}
