package br.com.pegasus.forum.repository;

import br.com.pegasus.forum.model.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
    List<Pergunta> findByAutorId(Long idAutorPergunta);
}
