package br.edu.ifpb.gugawag.social.repository;

import br.edu.ifpb.gugawag.social.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade,Integer> {
}
