import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class SumadadosTest2 {

    //Dependencias
    @Mock
    private Dado D1;
    @Mock
    private Dado D2;
    //System under Test (SUT)
    @InjectMocks
    private Calculadora calc;


    @Test
    void sumadados() {
        // Generamos escenario de test
        calc = new Calculadora();
        //   Dado D1 = mock(Dado.class);
        //  Dado D2 = mock(Dado.class);
        // Controlamos la respuesta de los metodos
        when(D1.get_value(anyInt(), eq(3))).thenReturn(5);
        when(D2.get_value(anyInt(), eq(3))).thenReturn(5);
        // Generamos el test
        double Resultado = calc.sumadados(D1, D2, 6, 3);
        assertEquals(10, Resultado);
    }
}