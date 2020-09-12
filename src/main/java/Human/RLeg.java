package Human;

public class RLeg {
    private String FootSize;
    private String LegLength;

    public String getFootSize() {
        return FootSize;
    }

    public String getLegLength() {
        return LegLength;
    }

    public void setLegLength(String legLength) {
        LegLength = legLength;
    }

    public void setFootSize(String footSize) {
        FootSize = footSize;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "FootSize='" + FootSize + '\'' +
                ", LegLength='" + LegLength + '\'' +
                '}';
    }
}
