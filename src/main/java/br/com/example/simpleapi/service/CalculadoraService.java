package br.com.example.simpleapi.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int somaValores(int valor1, int valor2){
        return valor1 + valor2;
    }

    public double divideValores(double valor1, double valor2) throws Exception {
        if(valor2 == 0){
            throw new Exception("Valor Inválido! Não existe divisão por 0!");
        }
        return valor1 / valor2;
    }
}
