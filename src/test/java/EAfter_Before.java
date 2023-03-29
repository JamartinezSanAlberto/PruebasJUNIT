import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EAfter_Before {
    Calculadora calc;

    @AfterAll
    static void afterAll() {
        System.out.println("Se ejecuta AfterAll");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Se ejecuta BeforeAll");

    }

    @AfterEach
    void pepito() {
        System.out.println("Se ejecuta Teardown");
    }

    @Test
        @DisplayName("Prueba del método suma")
        void sumaTest() {
        System.out.println("Se ejecuta sumaTest");

        }


        @Test
        @DisplayName("Prueba del método resta")
        void restaTest() {
            System.out.println("Se ejecuta restaTest");
        }

        @Test
        @DisplayName("Prueba del método multiplica")
        void smultiplicaTest() {
            System.out.println("Se ejecuta multiplicaTest");
        }

    @BeforeEach
    void setUp() {
        System.out.println("Se ejecuta SetUp");
    }

}
