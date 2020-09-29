package main.FurnitureShop;

import java.util.ArrayList;

public class Person {
    private ArrayList<Furniture> shoppingBag = new ArrayList<Furniture>();
    private double balance;
    private String name;

    public Person(ArrayList<Furniture> shoppingBag, double balance, String name) {
        this.shoppingBag = shoppingBag;
        this.balance = balance;
        this.name = name;
    }

    public Person(double balance, String name) {
        this.balance = balance;
        this.name = name;
        shoppingBag = new ArrayList<Furniture>();
    }

    public ArrayList<Furniture> getShoppingBag() {
        return shoppingBag;
    }

    public void setShoppingBag(ArrayList<Furniture> shoppingBag) {
        this.shoppingBag = shoppingBag;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Furniture shop){
        balance -= shop.getPrice();
        shoppingBag.add(shop);
    }

    @Override
    public String toString() {
        return "\nPerson:\n" +
                "\tкорзина: " + shoppingBag + " }";
    }
}
