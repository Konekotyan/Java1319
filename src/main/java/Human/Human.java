package Human;

public class Human {
    private String surname = "?";
    private String name = "?";
    private boolean sex;
    private int age;

    private Body body;
    private RHand rHand;
    private LHand lHand;
    private Head head;
    private RLeg rLeg;
    private LLeg lLeg;

    public Human() {}

    public int getAge() {
        return age;
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
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Body getBody() {
        return body;
    }
    public void setBody(int height, int weight) {
        body.setHeight(height);
        body.setHeight(weight);
    }

    public Head getHead() {
        return head;
    }
    public void setHead(String HairColor, String EyesColor) {
        head.setHairColor(HairColor);
        head.setEyesColor(EyesColor);
    }

    public LHand getlHand() {
        return lHand;
    }
    public void setlHand(int FingersCount) {
        lHand.setFingersCount(FingersCount);
    }

    public RHand getrHand() {
        return rHand;
    }
    public void setrHand( int FingersCount) {
        rHand.setFingersCount(FingersCount);
    }

    public LLeg getlLeg() {
        return lLeg;
    }
    public void setlLeg(String FootSize, String LegLength) {
       lLeg.setFootSize(FootSize);
       lLeg.setLegLength(LegLength);
    }

    public RLeg getrLeg() {
        return rLeg;
    }
    public void setrLeg(String FootSize, String LegLength) {
        rLeg.setFootSize(FootSize);
        rLeg.setLegLength(LegLength);
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
                ", body=" + body +
                ", rHand=" + rHand +
                ", lHand=" + lHand +
                ", head=" + head +
                ", rLeg=" + rLeg +
                ", lLeg=" + lLeg +
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

        if(age > 0 && age <100){
            this.age = age;
        }
        else {
            System.out.println("Invalid age of " + name + " " + surname);
        }
    }
}
