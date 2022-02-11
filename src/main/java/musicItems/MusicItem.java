package musicItems;

import interfaces.ISell;

public class MusicItem implements ISell {

    private String type;
    private double boughtPrice;
    private double sellPrice;

    public String getType() {
        return type;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public MusicItem(String type, double boughtPrice, double sellPrice) {
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.boughtPrice;
    }
}
