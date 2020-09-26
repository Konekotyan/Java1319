package main.FurnitureShop;

public class Table extends Furniture {

    public Table(String material, int price) {
        super(material, price);
    }

    @Override
    public String toString() {
        return "Стол: " +
                "материал: " + getMaterial() +
                ", цена: " + getPrice() + " руб";
    }
}