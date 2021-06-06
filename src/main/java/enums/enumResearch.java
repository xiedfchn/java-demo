package enums;

public class enumResearch {
    public static void main(String[] args) {

        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.mass());
    }
}

enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6);

    private final double mass;   // in kilograms
    private final double radius; // in meters
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    double mass() { return mass; }
    double radius() { return radius; }


}
