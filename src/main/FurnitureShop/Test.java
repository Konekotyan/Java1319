package main.FurnitureShop;

public class Test {
    public static void main(String[] args) {

        Chair chair = new Chair("Plastic", 2000);
        System.out.println(chair.toString());

        Table table = new Table("Wood", 8000);
        System.out.println(table.toString());

        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.add(table);
        furnitureShop.add(chair);
        System.out.println(furnitureShop.toString());

        Person customer = new Person(15000, "Bob");
        customer.addProduct(table);
        customer.addProduct(chair);
        customer.addProduct(chair);
        System.out.println(customer.toString());
        System.out.println(customer.getBalance());
    }
}
