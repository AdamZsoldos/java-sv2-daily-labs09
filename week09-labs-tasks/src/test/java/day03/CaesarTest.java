package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void testEncryptByZero() {
        Caesar caesar = new Caesar(0);
        assertEquals("Hello World!", caesar.encrypt("Hello World!"));
    }

    @Test
    void testEncryptByOne() {
        Caesar caesar = new Caesar(1);
        assertEquals("Ifmmp Xpsme!", caesar.encrypt("Hello World!"));
    }

    @Test
    void testEncryptByNegativeFive() {
        Caesar caesar = new Caesar(-5);
        assertEquals("Czggj Rjmgy!", caesar.encrypt("Hello World!"));
    }

    @Test
    void testEncryptRedundant() {
        Caesar caesar = new Caesar(26);
        assertEquals("Hello World!", caesar.encrypt("Hello World!"));
    }

    @Test
    void testEncryptSameAmountBothWays() {
        Caesar caesar1 = new Caesar(9);
        Caesar caesar2 = new Caesar(-9);
        assertEquals("Hello World!", caesar2.encrypt(caesar1.encrypt("Hello World!")));
        assertEquals("Hello World!", caesar1.encrypt(caesar2.encrypt("Hello World!")));
    }
}
