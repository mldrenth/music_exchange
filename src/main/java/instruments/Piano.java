package instruments;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(String brand, String material, String colour, double boughtPrice, double sellPrice) {
        super("Piano", brand, material, colour, InstrumentType.KEYBOARD, boughtPrice, sellPrice);
        this.numberOfKeys = 88;
    }

    public String play() {
        return "I make piano sounds";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
