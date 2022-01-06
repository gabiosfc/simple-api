package br.com.example.helloworld.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
//@RequestMapping("/home")
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "teste";
    }

    @GetMapping(value = "/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = "/exibeEntrada")
    public String exibeEntrada(@RequestParam String input){
        return input;

    }

}
