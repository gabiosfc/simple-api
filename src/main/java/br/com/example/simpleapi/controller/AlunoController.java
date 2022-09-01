package br.com.example.simpleapi.controller;

import br.com.example.simpleapi.model.Aluno;
import br.com.example.simpleapi.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping(value = "/buscaAluno")
    public Aluno buscaAluno(@RequestParam Integer id){
        return alunoService.buscaAluno(id);
    }

    @GetMapping(value = "/listaAlunos")
    public List<Aluno> listaAlunos(){
        return alunoService.listaAlunos();
    }

    @PostMapping(value = "/insereAluno")
    public Integer insereAluno(@RequestBody Aluno aluno){
        return alunoService.insereAluno(aluno);
    }
}
