package main.Lab_2;

public class Dog {
    private String name;
    private int age;

    public Dog(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void IntoHumanAge(int age) {this.age = age*7;}

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name='" + name + '\'' +
                ", human age='" + age + '\'' +
                '}';
    }
}
