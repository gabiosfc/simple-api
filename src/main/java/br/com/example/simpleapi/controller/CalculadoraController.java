package br.com.example.simpleapi.controller;
import br.com.example.simpleapi.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraService calcauladoraService;

    @GetMapping(value = "/somaValores")
    public int somaValores(@RequestParam int valor1, int valor2){
        return calcauladoraService.somaValores(valor1, valor2);
    }

    @GetMapping(value = "/divideValores")
    public double divideValores(@RequestParam double valor1, double valor2) throws Exception {
        return calcauladoraService.divideValores(valor1, valor2);
    }
}
