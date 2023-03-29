import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class SumadadosTest {

    @Test
    void metodoparasumadadosTest (){
        Calculadora calc = new Calculadora();
        // Creamos objetos ficticios
        Dado D1 = spy(Dado.class);
        Dado D2 = mock(Dado.class);
        //Establecemos su comportamiento
       // when(D1.get_value(8,3)).thenThrow(IllegalArgumentException.class);
       // when(D1.get_value(8,3)).thenThrow(IllegalArgumentException.class);
        //when(D1.get_value(6,3)).thenReturn(5);
        doReturn(5).when(D1).get_value(6,3);
        //when(D2.get_value(6,3)).thenReturn(6);
        doCallRealMethod().when(D2).get_value(6,3);
        Integer Resultado = calc.sumadados(D1,D2, 6, 3);
        assertEquals(11,Resultado);




    }


}