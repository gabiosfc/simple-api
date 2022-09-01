package br.com.example.simpleapi.controller;
import br.com.example.simpleapi.model.Aluno;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
//@RequestMapping("/home")
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "simple-api";
    }

    @GetMapping(value = "/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = "/exibeEntrada")
    public String exibeEntrada(@RequestParam String input){
        return input;
    }

    @PostMapping(value = "/insertNomeAluno")
    public String insertNomeAluno(@RequestParam String nome){
        return "O aluno "+ nome + " foi inserido no banco de daods da universidade.";
    }

    @PostMapping(value = "/insertAluno")
    public String insertNomeAluno(@RequestBody Aluno novoAluno){
        String str = "";
        str += "\nNome: " + novoAluno.getNome();
        str += "\nMatrícula: " + novoAluno.getMatricula();
        str += "\nCurso: " + novoAluno.getCurso();
        str += "\nIdade: " + novoAluno.getIdade();

        return str;
    }

}
