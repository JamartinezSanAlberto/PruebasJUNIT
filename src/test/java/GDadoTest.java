import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GDadoTest {

    @Test
    @RepeatedTest(10)
    void get_value() {
    Dado D = new Dado();
    int resultado = D.get_value(6,3);
    assertNotEquals(3,resultado);
    }
}