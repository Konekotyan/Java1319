package main.Lab_15;

public class Tester {
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.add(3);
        System.out.println(collection);
        collection.add(5);
        System.out.println(collection);
        collection.add(989);
        System.out.println(collection);
        collection.add(134);
        System.out.println(collection);
        collection.add(12);
        System.out.println(collection);
        collection.remove(989);
        System.out.println(collection);
        System.out.println(collection.getMax());
        System.out.println(collection.getMin());
        System.out.println(collection.getAverage());
    }

}