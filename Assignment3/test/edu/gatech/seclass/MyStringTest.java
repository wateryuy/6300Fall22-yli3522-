package edu.gatech.seclass;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Junit test class created for use in Georgia Tech CS6300.
 * <p>
 * This class is provided to interpret your grades via junit tests
 * and as a reminder, should NOT be posted in any public repositories,
 * even after the class has ended.
 */

public class MyStringTest {

    private MyStringInterface mystring;

    @BeforeEach
    public void setUp() {
        mystring = new MyString();
    }

    @BeforeEach
    public void tearDown() {
        mystring = null;
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: First count number example in the interface documentation
    public void testCountAlphabeticWords1() {
        mystring.setString("My numbers are 11, 96, and thirteen");
        assertEquals(5, mystring.countAlphabeticWords());
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testCountAlphabeticWords2() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testCountAlphabeticWords3() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testCountAlphabeticWords4() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testSetString1() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: Sample encryption 1
    public void testEncrypt1() {
        mystring.setString("Cat & 5 DogS");
        assertEquals("nD0 & o sB7v", mystring.encrypt(5, 3));
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testEncrypt2() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testEncrypt3() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testEncrypt4() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testEncrypt5() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testEncrypt6() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: First convert digits example in the interface documentation
    public void testConvertDigitsToNamesInSubstring1() {
        mystring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mystring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mystring.getString());
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testConvertDigitsToNamesInSubstring2() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testConvertDigitsToNamesInSubstring3() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testConvertDigitsToNamesInSubstring4() {
        fail("Not yet implemented");
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    // Description: <Add test description here>
    public void testConvertDigitsToNamesInSubstring5() {
        fail("Not yet implemented");
    }
}
