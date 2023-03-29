import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class HParametrizacion {

    @Tag("")
    @DisplayName("Prueba del método suma")
    @CsvFileSource(resources = "Bateria2.csv",delimiter = ';',numLinesToSkip = 1)
    @ParameterizedTest
    void sumaTest(int valorA, int valorB, int Salida) {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(valorA,valorB) ;
        //assertNull(resultado, ()-> "Ha fallado el test aqui");
        //assertFalse(resultado>0);
        assertEquals(Salida, resultado);
    }

}
