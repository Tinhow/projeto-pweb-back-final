package br.edu.ifpb.gugawag.social.service;

import br.edu.ifpb.gugawag.social.model.Atividade;

import java.util.List;

public interface IAtividadeService {

    List<Atividade> getAtividades();

    Atividade addAtividade(Atividade atividade);

    Atividade getAtividade(Integer id);

    Boolean removerAtividade(Integer id);

    Atividade atualizarAtividade(Atividade atividade);
}
