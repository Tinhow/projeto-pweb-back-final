package br.edu.ifpb.gugawag.social.controller;


import br.edu.ifpb.gugawag.social.model.Atividade;
import br.edu.ifpb.gugawag.social.service.imlp.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @GetMapping("/atividades")
    public List<Atividade> getAtivdades(){
        return this.atividadeService.getAtividades();
    }

    @GetMapping("/atividades/{id}")
    public Atividade getAtividadePorId(@PathVariable("id") Integer idAtividade) {
        return this.atividadeService.getAtividade(idAtividade);
    }

    @PostMapping("/atividades")
    public Atividade inserirAtividade(@RequestBody Atividade AtividadeAInserir) {
        return this.atividadeService.addAtividade(AtividadeAInserir);
    }

    @PutMapping("/atividades/{id}")
    public Atividade atualizarAtividade(@RequestBody Atividade AtividadeAtualizar) {
        return this.atividadeService.atualizarAtividade(AtividadeAtualizar);
    }

    @DeleteMapping("/atividades/{id}")
    public void apagarAtividade(@PathVariable("id") Integer id) {
        this.atividadeService.removerAtividade(id);
    }

}
