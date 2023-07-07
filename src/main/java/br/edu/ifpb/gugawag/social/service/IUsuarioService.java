package br.edu.ifpb.gugawag.social.service;

import br.edu.ifpb.gugawag.social.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> getUsuarios();

    Usuario addUsuarios(Usuario usuario);

    Usuario getUsuario(Integer id);

    Boolean removerUsuario(Integer id);

    Usuario atualizarUsuario(Usuario usuario);
}
