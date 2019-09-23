package pl.basics.learning.zwierzyniec.reptile;

public class Lizard {

    private String skinColor;
    private int maxSpeed;
    private int length;


    public Lizard(String skinColor, int maxSpeed, int length) {
        this.skinColor = skinColor;
        this.maxSpeed = maxSpeed;
        this.length = length;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
