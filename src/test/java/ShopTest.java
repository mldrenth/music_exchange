import instruments.Guitar;
import instruments.Piano;
import musicItems.MusicItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    private Shop shop;
    private MusicItem sheetMusic;
    private Piano piano;
    private Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Gibson", "Wood", "Brown", 300.00, 400.00);
        piano = new Piano("Bechstein", "Wood", "Black", 1000.00, 1500.00);
        sheetMusic = new MusicItem("Sheet Music", 10.00, 15.00);
    }

    @Test
    public void hasEmptyStock(){
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(sheetMusic);
        shop.removeFromStock(piano);
        assertEquals(2, shop.getStockSize());
        assertFalse(shop.getStock().contains(piano));
    }

    @Test
    public void canCalcProfit(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        assertEquals(600, shop.calculateProfit(),0.00);
    }

}
