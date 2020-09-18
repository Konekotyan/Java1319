package main.Human;

public class RHand {
    private int FingersCount;

    public int getFingersCount() {
        return FingersCount;
    }

    public void setFingersCount(int fingersCount) {
        FingersCount = fingersCount;
    }

    @Override
    public String toString() {
        return "FingersCount=" + FingersCount;
    }
}
