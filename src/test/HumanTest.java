package test;

import main.Lab_3.Human.Human;

public class HumanTest {
    public static void main(String[] args) {
        Human Unfortunate =  new Human();
        Unfortunate.setName();
        Unfortunate.setSurname();
        Unfortunate.setSex();
        Unfortunate.setAge();
        Unfortunate.setBody();
        Unfortunate.setHead();
        Unfortunate.setrHand();
        Unfortunate.setlHand();
        Unfortunate.setrLeg();
        Unfortunate.setlLeg();
        System.out.println(Unfortunate.toString());
    }
}
