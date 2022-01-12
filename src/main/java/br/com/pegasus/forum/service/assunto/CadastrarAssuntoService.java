package br.com.pegasus.forum.service.assunto;

import br.com.pegasus.forum.model.Assunto;
import br.com.pegasus.forum.model.AssuntoCadastroForm;
import br.com.pegasus.forum.repository.AssuntoRepository;
import br.com.pegasus.forum.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarAssuntoService implements IGenericService<Void, AssuntoCadastroForm, Void> {

    @Autowired
    private AssuntoRepository assuntoRepository;

    @Override
    public Void execute(Void key, AssuntoCadastroForm body) {
        var assunto = Assunto.builder().descricao(body.getDescricao()).build();
        assuntoRepository.save(assunto);
        return null;
    }
}
