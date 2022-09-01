package br.com.example.simpleapi.repository;


import br.com.example.simpleapi.model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
    public Optional<Aluno> findById(Integer id);
    public List<Aluno> findAll();
}
