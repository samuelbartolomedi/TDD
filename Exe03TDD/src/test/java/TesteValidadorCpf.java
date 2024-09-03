import ValidadorCpf.ValidadorCpf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteValidadorCpf {
    @Test
    public void testeFormatoValido() {
        ValidadorCpf validador = new ValidadorCpf();
        boolean valido = validador.validar("123.456.789-09");
        assertEquals(true, valido);
    }

    @Test
    public void testeNumeroRepetido() {
        ValidadorCpf validador = new ValidadorCpf();
        boolean valido = validador.validar("123.456.789-00");
        assertEquals(false, valido);
    }

    @Test
    public void testeFormatoInvalido1() {
        ValidadorCpf validador = new ValidadorCpf();
        boolean valido = validador.validar("12345678909");
        assertEquals(false, valido);
    }

    @Test
    public void testeFormatoInvalido2() {
        ValidadorCpf validador = new ValidadorCpf();
        boolean valido = validador.validar("123.456.789-091");
        assertEquals(false, valido);
    }

    @Test
    public void testeCpfNull(){
        ValidadorCpf validador = new ValidadorCpf();
        boolean valido = validador.validar(null);
        assertEquals(false, valido);
    }
}
