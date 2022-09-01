package br.com.example.simpleapi.service;

import br.com.example.simpleapi.model.Aluno;
import br.com.example.simpleapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    public Aluno buscaAluno(Integer id) {
        return alunoRepository.findById(id).get();
    }

    public List<Aluno> listaAlunos() {
        return alunoRepository.findAll();
    }

    public Integer insereAluno(Aluno aluno){
        alunoRepository.save(aluno);
        return 2;
    }
}
