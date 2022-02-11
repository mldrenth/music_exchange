
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Bechstein", "Wood", "Black", 1000.00, 1500.00);
    }

    @Test
    public void hasName(){
        assertEquals("Piano", piano.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Bechstein", piano.getBrand());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(1000.00, piano.getBoughtPrice(), 0.00);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1500.00, piano.getSellPrice(), 0.00 );
    }

    @Test
    public void canCalcMarkup(){
        assertEquals(500.00, piano.calculateMarkup(), 0.00);
    }

    @Test
    public void canPlay(){
        assertEquals("I make piano sounds", piano.play());
    }

}
