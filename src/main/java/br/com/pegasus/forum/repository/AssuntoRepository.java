package br.com.pegasus.forum.repository;

import br.com.pegasus.forum.model.Assunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuntoRepository extends JpaRepository<Assunto, Long> {
}
