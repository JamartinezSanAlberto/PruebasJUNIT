import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@Tag("hola")
class AAsserts {

    @Test
    @DisplayName("Prueba del método suma")
    void sumaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(2,3) ;
        assertNull(resultado, ()-> "Ha fallado el test aqui");
        assertFalse(resultado>0);
        assertEquals(5, resultado);
    }

}