import musicItems.MusicItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicItemTest {

    private  MusicItem sheetMusic;

    @Before
    public void before(){
        sheetMusic = new MusicItem("Sheet Music", 10.00, 15.00);
    }

    @Test
    public void hasType(){
        assertEquals("Sheet Music", sheetMusic.getType());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(10.00, sheetMusic.getBoughtPrice(), 0.00);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15.00, sheetMusic.getSellPrice(), 0.00);
    }

    @Test
    public void canCalcMarkup(){
        assertEquals(5.00, sheetMusic.calculateMarkup(), 0.00);
    }


}
