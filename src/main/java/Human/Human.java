package Human;

public class Human {
    private String surname = "?";
    private String name = "?";
    private boolean sex;
    private int age;
    private int height;
    private int weight;

    public Human() {}

    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSurname() {
        return surname;
    }
    public void setHeight(int height) {
        if(height > 0 && height <300) this.height = height;
        else System.out.println("Invalid height");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        if(weight > 0 && weight <300){
            this.weight = weight;
        }
        else{
            System.out.println("Invalid weight");
        }
    }
    public boolean isSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Human(String surname, String name, boolean sex) {
        if(surname!=null){
            this.surname = surname;
        }
        else{
            System.out.println("Invalid surname");
        }
        if(name!=null) {
            this.name = name;
        }
        else{
            System.out.println("Invalid name");
        }
        this.sex = sex;
    }

    public Human(String surname, String name, boolean sex,  int age, int height, int weight) {
        if(surname!=null){
            this.surname = surname;
        }
        else{
            System.out.println("Invalid surname");
        }
        if(name!=null) {
            this.name = name;
        }
        else{
            System.out.println("Invalid name");
        }
        this.sex = sex;
        if(weight > 0 && weight <300){
            this.weight = weight;
        }
        else {
            System.out.println("Invalid weight of " + name + " " + surname);
        }
        if(height > 0 && height <300){
            this.height = height;
        }
        else {
            System.out.println("Invalid height of " + name + " " + surname);
        }
        if(age > 0 && age <100){
            this.age = age;
        }
        else {
            System.out.println("Invalid age of " + name + " " + surname);
        }
    }
}
