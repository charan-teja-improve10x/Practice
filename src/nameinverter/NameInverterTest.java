package nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NameInverterTest {

    private NameInverter nameInverter;

    @BeforeEach
    public void setup(){
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnEmpty() {
        String invertedName =  nameInverter.inverterName("");
        assertEquals("", invertedName);
    }

    @Test
    public void givenFirst_returnFirst() {
        String invertedName =  nameInverter.inverterName("First");
        assertEquals("First", invertedName);
    }

    @Test
    public void givenFirstWithSpaces_returnFirst() {
        String invertedName =  nameInverter.inverterName("  First  ");
        assertEquals("First", invertedName);
    }

    @Test
    public void givenFirstLast_returnLastFirst() {
        String invertedName =  nameInverter.inverterName("First Last");
        assertEquals("Last, First", invertedName);
    }

    @Test
    public void givenHonorifics_removeHonorifics() {
        String invertedName =  nameInverter.inverterName("Mrs. First Last");
        assertEquals("Last, First", invertedName);
    }

    @Test
    public void givenOtherHonorifics_removeHonorifics() {
        String invertedName =  nameInverter.inverterName("Mr. First Last");
        assertEquals("Last, First", invertedName);
    }

    @Test
    public void givenHonorificsMiss_removeHonorifics() {
        String invertedName =  nameInverter.inverterName("Miss. First Last");
        assertEquals("Last, First", invertedName);
    }

    @Test
    public void givenPostNominal_returnPostNominal() {
        String invertedName =  nameInverter.inverterName("First Last Msc.");
        assertEquals("Last, First Msc.", invertedName);
    }

    @Test
    public void givenMultiPostNominal_returnMultiPostNominal() {
        String invertedName =  nameInverter.inverterName("First Last Msc. PHd.");
        assertEquals("Last, First Msc. PHd.", invertedName);
    }
}
