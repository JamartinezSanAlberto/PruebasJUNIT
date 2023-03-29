import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.*;

public class FConditional {


    @Nested
    @EnabledOnOs(OS.WINDOWS)
     class windowsTest{
        @Test
        @RepeatedTest(5)
        void Windows1() {
            assertTrue(true );
        }
        @Test
        void Windows2() {
            assertTrue(true );
        }
        @Test
        void Windows3() {
            assertTrue(true );
        }

        }

    }
    @Nested
    @EnabledOnOs(OS.LINUX)
     class LinuxTest{
        @Test
        void lINUX1() {
            assertTrue(true );
        }
        @Test
        void lINUX2() {
            assertTrue(true );
        }
        @Test
        @RepeatedTest(5)
        void lINUX3() {
            assertTrue(true );
        }


    }


