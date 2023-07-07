package br.edu.ifpb.gugawag.social.service.imlp;

import br.edu.ifpb.gugawag.social.model.Usuario;
import br.edu.ifpb.gugawag.social.repository.UsuarioRepository;
import br.edu.ifpb.gugawag.social.service.IUsuarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepositorio;

    @Override
    public List<Usuario> getUsuarios() {

        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario addUsuarios(Usuario usuario)
    {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario getUsuario(Integer id) {
        return usuarioRepositorio.findById(id).orElse(new Usuario());
    }

    @Override
    public Boolean removerUsuario(Integer id) {
        Usuario usuario = this.getUsuario(id);
        try{
            usuarioRepositorio.delete(usuario);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Usuario atualizarUsuario(Usuario usuario) {
        Usuario usuarioInserido = this.usuarioRepositorio.save(usuario);
        if (usuario.getIdade() < 18) {
            throw new RuntimeException("Menor de idade não permitido");
        }
        return usuarioInserido;
    }
}

