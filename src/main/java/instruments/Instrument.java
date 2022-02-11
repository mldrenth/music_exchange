package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private String brand;
    private String material;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(String name, String brand, String material, String colour, InstrumentType instrumentType, double boughtPrice, double sellPrice) {
        this.name = name;
        this.brand = brand;
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    private String colour;
    private InstrumentType instrumentType;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getBoughtPrice();
    }
}
