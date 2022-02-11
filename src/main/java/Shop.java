import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockSize(){
        return stock.size();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public double calculateProfit() {
        double profit = 0;
        for (ISell item : stock){
            profit += item.calculateMarkup();
        }
        return profit;

    }
}
