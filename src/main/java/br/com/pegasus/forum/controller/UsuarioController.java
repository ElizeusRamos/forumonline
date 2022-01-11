package br.com.pegasus.forum.controller;

import br.com.pegasus.forum.model.UserCadastroForm;
import br.com.pegasus.forum.model.UserDetalhesDto;
import br.com.pegasus.forum.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsersApi, UserApi{
    @Override
    public ResponseEntity<UserDetalhesDto> buscarUsuario(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> inserirUsuario(UserCadastroForm body) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserDto>> listarUsuarios(String filter) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @Override
    public ResponseEntity<Void> alterarEmailUsuario(Long id, String emailNovo) {
        return null;
    }

    @Override
    public ResponseEntity<Void> alterarFormacaoUsuario(Long id, String formacaoNova) {
        return null;
    }

    @Override
    public ResponseEntity<Void> alterarNomeUsuario(Long id, String nomeNovo) {
        return null;
    }

    @Override
    public ResponseEntity<Void> alterarProfissaoUsuario(Long id, String profissaoNova) {
        return null;
    }

    @Override
    public ResponseEntity<Void> alterarSenhaUsuario(Long id, String senhaAtual, String senhaNova) {
        return null;
    }
}
