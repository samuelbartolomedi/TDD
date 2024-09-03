import CalculadoraFrete.CalcularFrete;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadoraFrete {
    @Test
    public void testePorDistancia(){
        CalcularFrete calculadora = new CalcularFrete();
        double valorFrete = calculadora.calcular(10, 20);
        assertEquals(0, valorFrete);
    }

    @Test
    public void testePorPeso(){
        CalcularFrete calculadora = new CalcularFrete();
        double valorFrete = calculadora.calcular(0.4, 100);
        assertEquals(0, valorFrete);
    }
}
