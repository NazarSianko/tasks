import java.util.ArrayList;

public class Bouquet {
    private double price;
    private ArrayList<Flower> flowers = new ArrayList<Flower>();
    public Bouquet() {
    }
    public double getPrice() {
        return price;
    }

    public Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;
    }
}

