import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BAssertThrow {

    @Test
    void dividirTest() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class,()->calc.divide(2,0));
    }
}



