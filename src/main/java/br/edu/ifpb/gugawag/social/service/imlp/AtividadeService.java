package br.edu.ifpb.gugawag.social.service.imlp;

import br.edu.ifpb.gugawag.social.model.Atividade;
import br.edu.ifpb.gugawag.social.repository.AtividadeRepository;
import br.edu.ifpb.gugawag.social.service.IAtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService implements IAtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepositorio;

    @Override
    public List<Atividade> getAtividades() {
        return atividadeRepositorio.findAll();
    }

    @Override
    public Atividade addAtividade(Atividade atividade) {
        return atividadeRepositorio.save(atividade);
    }

    @Override
    public Atividade getAtividade(Integer id) {
        return atividadeRepositorio.findById(id).orElse(new Atividade());
    }

    @Override
    public Boolean removerAtividade(Integer id) {
        Atividade atividade = this.getAtividade(id);
        try{
            atividadeRepositorio.delete(atividade);
        }catch (Exception e){
            return false;
        }
        return true;

    }

    @Override
    public Atividade atualizarAtividade(Atividade atividade) {

        return atividadeRepositorio.save(atividade);
    }
}
