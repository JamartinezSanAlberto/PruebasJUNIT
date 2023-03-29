import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CAssertAll {

    @Test
    void sumaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(2, 3);
        assertAll("Agrupamiento de Assert",
                ()->assertNull(resultado, () -> "Ha fallado el test aqui"),
                ()->assertFalse(resultado > 0),
                ()->assertEquals(5, resultado)
                );
    }
}