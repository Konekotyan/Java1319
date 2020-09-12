package Human;

public class Head {
    private String HairColor;
    private String EyesColor;

    public String getEyesColor() {
        return EyesColor;
    }

    public void setHairColor(String hairColor) {
        HairColor = hairColor;
    }

    public void setEyesColor(String eyesColor) {
        EyesColor = eyesColor;
    }

    public String getHairColor() {
        return HairColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "HairColor='" + HairColor + '\'' +
                ", EyesColor='" + EyesColor + '\'' +
                '}';
    }
}
