import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson", "Wood", "Brown", 300.00, 400.00);
    }

    @Test
    public void hasName(){
        assertEquals("Guitar", guitar.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Gibson", guitar.getBrand());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(300.00, guitar.getBoughtPrice(), 0.00);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(400.00, guitar.getSellPrice(), 0.00 );
    }

    @Test
    public void canCalcMarkup(){
        assertEquals(100.00, guitar.calculateMarkup(), 0.00);
    }

    @Test
    public void canPlay(){
        assertEquals("I make guitar sounds", guitar.play());
    }

}
