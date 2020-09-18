package main.Human;

public class Body {
    private int height;
    private int weight;

    public void setWeight(int weight) {
        if(weight > 0 && weight <300){
            this.weight = weight;
        }
        else{
            System.out.println("Invalid weight");
        }
    }

    public void setHeight(int height) {
        if(height > 0 && height <300) this.height = height;
        else System.out.println("Invalid height");
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "height=" + height +
                ", weight=" + weight;
    }
}
