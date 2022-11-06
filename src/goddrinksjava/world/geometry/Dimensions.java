package goddrinksjava.world.geometry;

import goddrinksjava.world.Attribute;

public class Dimensions {

    protected int numDimensions;

    public Dimensions(int numDimensions) {
        this.numDimensions = numDimensions;
    }

    public Attribute toAttribute() {
        return new Attribute("dimensions", Integer.toString(this.numDimensions));
    }
}
