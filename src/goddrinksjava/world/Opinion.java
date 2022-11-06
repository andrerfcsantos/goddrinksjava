package goddrinksjava.world;

public class Opinion {

    protected String topic = "";
    protected boolean value = false;

    public Opinion(String topic, boolean value) {
        this.topic = topic;
        this.value = value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Opinion opinion = (Opinion) o;

        return topic.equals(opinion.topic);
    }

    @Override
    public int hashCode() {
        return topic.hashCode();
    }
}
