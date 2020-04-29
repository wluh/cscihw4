package luh.SUPPORT;

public enum Mineral {
    DILITHIUM(40,140),
    TRITANIUM(80,180),
    UNANIUM  (90,270);

    public double getMass() {
        return mass;
    }

    public double getStrength() {
        return strength;
    }

    private double mass;
    private double strength;

    Mineral(double mass, double strength) {
        this.mass = mass;
        this.strength = strength;
    }
}
