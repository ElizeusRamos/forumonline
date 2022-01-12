package br.com.pegasus.forum.controller;

import br.com.pegasus.forum.model.AssuntoCadastroForm;
import br.com.pegasus.forum.model.AssuntoDto;
import br.com.pegasus.forum.service.assunto.CadastrarAssuntoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssuntoController implements MattersApi{

    @Autowired
    private CadastrarAssuntoService cadastrarAssuntoService;

    @Override
    public ResponseEntity<Void> inserirAssunto(AssuntoCadastroForm body)  {
        cadastrarAssuntoService.execute(null, body);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<AssuntoDto>> listarAssuntos(String filter) {
        return null;
    }

    @Override
    public ResponseEntity<Void> removerAssunto(String id) {
        return null;
    }
}
