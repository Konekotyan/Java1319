package Human;

import java.util.Scanner;

public class Human {
    Scanner console = new Scanner(System.in);
    private String surname = "?";
    private String name = "?";
    private boolean sex;
    private int age;

    Body body = new Body();
    RHand rHand = new RHand();
    LHand lHand = new LHand();
    Head head = new Head();
    RLeg rLeg = new RLeg();
    LLeg lLeg = new LLeg();

    public Human() {
        System.out.println("Enter the test subject's personal data.");
    }

    public void setAge() {
        System.out.print("Age: ");
        int age = console.nextInt();
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName() {
        System.out.print("Name: ");
        String name = console.nextLine();
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSex() {
        System.out.print("Sex: ");
        boolean sex = console.nextBoolean();
        this.sex = sex;
    }
    public boolean isSex() {
        return sex;
    }

    public void setSurname() {
        System.out.print("Surname: ");
        String surname = console.nextLine();
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setBody() {
        System.out.print("Height: ");
        int height = console.nextInt();
        body.setHeight(height);
        System.out.print("Weight: ");
        int weight = console.nextInt();
        body.setWeight(weight);
    }
    public Body getBody() {
        return body;
    }

    public void setHead() {
        console.nextLine();
        System.out.print("Hair color: ");
        String hairColor = console.nextLine();
        head.setHairColor(hairColor);

        System.out.print("Eyes color: ");
        String EyesColor = console.nextLine();
        head.setEyesColor(EyesColor);
    }
    public Head getHead() {
        return head;
    }

    public void setlHand() {
        System.out.print("Left hand fingers count: ");
        int FingersCount = console.nextInt();
        lHand.setFingersCount(FingersCount);
    }
    public LHand getlHand() {
        return lHand;
    }

    public void setrHand() {
        System.out.print("Right hand fingers count: ");
        int FingersCount = console.nextInt();
        rHand.setFingersCount(FingersCount);
    }
    public RHand getrHand() {
        return rHand;
    }

    public void setlLeg() {
        System.out.print("Left leg foot size: ");
        String FootSize = console.nextLine();
        lLeg.setFootSize(FootSize);
        System.out.print("Left leg length: ");
        String LegLength = console.nextLine();
        lLeg.setLegLength(LegLength);
    }
    public LLeg getlLeg() {
        return lLeg;
    }


    public void setrLeg() {
        console.nextLine();
        System.out.print("Right leg foot size: ");
        String FootSize = console.nextLine();
        rLeg.setFootSize(FootSize);
        System.out.print("Right leg length: ");
        String LegLength = console.nextLine();
        rLeg.setLegLength(LegLength);
    }
    public RLeg getrLeg() {
        return rLeg;
    }

    @Override
    public String toString() {
        return "The test subject №237:"+ '\n' +
                "surname: " + surname + '\n' +
                "name: " + name+ '\n' +
                "sex: " + sex+ '\n' +
                "age: " + age+ '\n' +
                "body: " + body+ '\n' +
                "head: " + head+ '\n' +
                "rHand: " + rHand + '\n'+
                "lHand: " + lHand+ '\n' +
                "rLeg: " + rLeg+ '\n' +
                "lLeg: " + lLeg;
    }

}
