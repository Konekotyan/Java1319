package main.FurnitureShop;

import java.util.HashSet;

public class FurnitureShop {
    private HashSet<Furniture> furniture = new HashSet<Furniture>();

    public FurnitureShop() {
    }

    public FurnitureShop(HashSet<Furniture> furniture) {
        this.furniture = furniture;
    }

    public void add(Furniture table) {
        furniture.add(table);
    }

    public HashSet<Furniture> getAll() {
        return furniture;
    }

    public void del(Table table) {
        furniture.remove(table);
    }
    @Override
    public String toString() {
        return "\nFurnitureShop:\n" +
                "\tмебель: " + furniture + " }";
    }
}
