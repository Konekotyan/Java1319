package main.FurnitureShop;

public class Chair extends Furniture {

    public Chair(String material, int price) {
        super(material, price);
    }

    @Override
    public String toString() {
        return "Стул: " +
                "материал: " + getMaterial() +
                ", цена: " + getPrice() + " руб";
    }
}