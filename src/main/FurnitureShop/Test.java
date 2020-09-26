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
    }
}
