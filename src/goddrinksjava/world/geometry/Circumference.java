package goddrinksjava.world.geometry;

import goddrinksjava.world.Attribute;

public class Circumference {

    private double radius;

    public Circumference(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public Attribute toAttribute() {
        return new Attribute("circumference", Double.toString(this.getCircumference()));
    }
}
