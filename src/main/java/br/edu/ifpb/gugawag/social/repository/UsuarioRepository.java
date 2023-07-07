package br.edu.ifpb.gugawag.social.repository;

import br.edu.ifpb.gugawag.social.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
