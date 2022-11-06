package goddrinksjava.world;

public class Memory {

    protected String data = "";

    public Memory(String data) {
        this.data = data;
    }

    public boolean isErasable() {
        return !data.isEmpty();
    }
}
