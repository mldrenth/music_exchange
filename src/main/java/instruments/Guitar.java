package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;


    public Guitar(String brand, String material, String colour, double boughtPrice, double sellPrice) {
        super("Guitar", brand, material, colour, InstrumentType.STRING, boughtPrice, sellPrice);
        this.numberOfStrings = 6;
    }

    public String play() {
        return "I make guitar sounds";
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }


}
