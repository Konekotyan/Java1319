package main.flab;

import java.util.Scanner;

public class DogKennel {
    int Ksize;
    Dog[] dogs;

    public DogKennel(int size){
        this.Ksize = 0;
        dogs = new Dog[size];
    }

    public void setDogs(int size){

        Dog doggy = new Dog();


        for (int i=0; i < size; i++) {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter the dog's name: ");
            String name = console.nextLine();
            System.out.print("Enter the dog's age: ");
            int age = console.nextInt();
            doggy.setName(name);
            doggy.IntoHumanAge(age);
            this.dogs[i] = doggy;
        }
    }

    public Dog getDog(int i){
        return dogs[i];
    }
}
