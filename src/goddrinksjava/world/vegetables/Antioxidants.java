package goddrinksjava.world.vegetables;

import goddrinksjava.world.Attribute;

import java.util.ArrayList;
import java.util.List;

public class Antioxidants {
    protected List<String> antioxidants = new ArrayList<>();

    public void addAntioxidant(String antioxidant) {
        antioxidants.add(antioxidant);
    }

    public void clear() {
        antioxidants.clear();
    }

    public Attribute toAttribute() {
        return new Attribute("antioxidants", antioxidants.toString());
    }

}
