import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas de clase Calculadora")
class DDisplayName {

    @Test
    @DisplayName("Prueba del método suma")
    void sumaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(2,3) ;
        assertNotNull(resultado, ()-> "Ha fallado el test aqui");
        assertTrue(resultado>0);
        assertEquals(5, resultado);
    }


    @Test
    @DisplayName("Prueba del método resta")
    void restaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.resta(2,2) ;
        assertNotNull(resultado, ()-> "Ha fallado el test aqui");
        assertTrue(resultado>0);
        assertEquals(1, resultado);
    }

    @Test
    @DisplayName("Prueba del método multiplica")
    void smultiplicaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplica(2,3) ;
        assertNotNull(resultado, ()-> "Ha fallado el test aqui");
        assertTrue(resultado>0);
        assertEquals(6, resultado);
    }


}