package br.edu.ifpb.gugawag.social.controller;

import br.edu.ifpb.gugawag.social.model.Usuario;
import br.edu.ifpb.gugawag.social.service.imlp.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return this.usuarioService.getUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario getUsuarioPorId(@PathVariable("id") Integer idUsuario) {
        return this.usuarioService.getUsuario(idUsuario);
    }

    @PostMapping("/usuarios")
    public Usuario inserirUsuario(@RequestBody Usuario usuarioAInserir) {
        return this.usuarioService.addUsuarios(usuarioAInserir);
    }

    @PutMapping("/usuarios/{id}")
    public Usuario atualizarUsuario(@RequestBody Usuario usuarioAtualizar) {
        return this.usuarioService.atualizarUsuario(usuarioAtualizar);
    }

    @DeleteMapping("usuarios/{id}")
    public void apagarUsuario(@PathVariable("id") Integer id) {
        this.usuarioService.removerUsuario(id);
    }

}
