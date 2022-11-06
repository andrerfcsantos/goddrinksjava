package goddrinksjava.world.vegetables;

import goddrinksjava.world.Attribute;

import java.util.ArrayList;
import java.util.List;

public class Nutrients {
    protected List<String> nutrients = new ArrayList<>();

    public void addNutrient(String nutrient) {
        nutrients.add(nutrient);
    }

    public void clear() {
        nutrients.clear();
    }

    public Attribute toAttribute() {
        return new Attribute("nutrients", nutrients.toString());
    }

}
