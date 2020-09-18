package main.Konekotyan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the dog's name: ");
        String name = console.nextLine();
        System.out.print("Enter the dog's age: ");
        int age = console.nextInt();
        dog1.setName(name);
        dog1.IntoHumanAge(age);
        System.out.println(dog1);

        System.out.print("Enter the size of the nursery: ");
        int KennelSize = console.nextInt();
        DogKennel doggy = new DogKennel(KennelSize);
        System.out.print("Enter the number of dogs: ");
        int DogCount = console.nextInt();
        doggy.setDogs(DogCount);
        System.out.print("Enter the dog's number: ");
        int n = console.nextInt();
        System.out.println(doggy.getDog(n-1));
    }
}