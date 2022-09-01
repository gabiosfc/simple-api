package br.com.example.simpleapi.calculadora;


import br.com.example.simpleapi.service.CalculadoraService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void teste(){
        Assertions.assertEquals(1,1);
    }

    @Test
    public void testeSoma_sucesso(){
        CalculadoraService service = new CalculadoraService();
        int atual = service.somaValores(10,20);
        Assertions.assertEquals(30, atual);
    }

    @Test
    public void testeDivisao_10_dividido_por_4_sucesso() throws Exception {
        CalculadoraService service = new CalculadoraService();
        double atual = service.divideValores(10,4);
        Assertions.assertEquals(2.5, atual);
    }

    /*@Test(expected = Exception.class)
    public void testeDivisao_divisao_por_zero() throws Exception {
        CalculadoraService service = new CalculadoraService();
        double atual = service.divideValores(10,0);

    }*/

}
