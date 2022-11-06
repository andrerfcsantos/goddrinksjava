package goddrinksjava.world;

import goddrinksjava.world.animals.TabbyCat;
import goddrinksjava.world.geometry.*;
import goddrinksjava.world.vegetables.Antioxidants;
import goddrinksjava.world.vegetables.Eggplant;
import goddrinksjava.world.vegetables.Nutrients;
import goddrinksjava.world.vegetables.Tomato;

import java.util.*;

public class Thing implements PointSet, Circle, SineWave, Sequence, Eggplant, Tomato, TabbyCat {

    protected Dimensions dimensions = new Dimensions(3);
    protected Circumference circumference = new Circumference(3.14);
    protected double limit = Double.MAX_VALUE;

    protected List<Attribute> attributes = new ArrayList<>();
    protected List<Action> actions = new ArrayList<>();

    protected String currrent = "AC";

    protected List<String> feelings = new ArrayList<>();

    protected List<Action> senses = new ArrayList<>();

    protected List<String> announcementsReceived = new ArrayList<>();

    protected Nutrients nutrients = new Nutrients();
    protected Antioxidants antioxidants = new Antioxidants();

    protected boolean canSee = true;

    protected double satisfaction = 0;

    protected String proof = "";

    protected String gender = "F";

    protected String roleBDSM = "S";

    protected boolean isHigh = false;

    protected Thing[] parents = new Thing[2];

    protected Memory memory = new Memory("you");

    protected List<Opinion> opinions = new ArrayList<>(
            Arrays.asList(new Opinion[]{new Opinion("you are here", true)})
    );

    protected Execution execution;

    protected Set<String> topicsLearned = new HashSet<>();

    protected Set<String> examsTaken = new HashSet<>();

    public Thing() {
    }

    public Thing(Thing parent1, Thing parent2) {
        parents[0] = parent1;
        parents[1] = parent2;
    }
    @Override
    public Dimensions getDimensions() {
        return dimensions;
    }

    @Override
    public void resetDimensions() {
        this.dimensions = new Dimensions(1);
    }

    @Override
    public Circumference getCircumference() {
        return this.circumference;
    }

    @Override
    public void resetCircumference() {
        this.circumference = new Circumference(1.0);
    }

    @Override
    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public double getTangent(double x) {
        return Math.tan(x);
    }

    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }

    public void addAction(String name, Object value) {
        this.actions.add(new Action(name, value));
    }

    public double getXPosition() {
        return 1;
    }

    public double toLimit() {
        return this.limit;
    }

    public void toggleCurrent() {
        if (this.currrent.equals("AC")) {
            this.currrent = "DC";
        } else {
            this.currrent = "AC";
        }
    }

    public void canSee(boolean canSee) {
        this.canSee = canSee;
    }

    public void addFeeling(String feeling) {
        this.feelings.add(feeling);
    }

    public void timeTravelForTwo(String ad, int i, Thing me, Thing you) {
    }

    public int getNumStimulationsAvailable() {
        return 10;
    }

    public int getNumStimulationsNeeded() {
        return 1;
    }

    public double toSatisfaction() {
        return 100;
    }

    public void setSatisfaction(double satisfaction) {
        this.satisfaction = satisfaction;
    }

    public int getFeelingIndex(String feeling) {
        return feelings.indexOf(feeling);
    }

    public void requestExecution(World world) {
        world.requestExecution(this);
    }

    @Override
    public void purr() {

    }

    @Override
    public Nutrients getNutrients() {
        return nutrients;
    }

    @Override
    public void resetNutrients() {
        nutrients.clear();
    }

    @Override
    public Antioxidants getAntioxidants() {
        return antioxidants;
    }

    @Override
    public void resetAntioxidants() {
        antioxidants.clear();
    }

    public String toProof() {
        return "god";
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public void toggleGender() {
        if(this.gender.equals("F")) {
            this.gender = "M";
        } else {
            this.gender = "F";
        }
    }

    public void toggleRoleBDSM() {
        if (this.roleBDSM.equals("S")) {
            this.roleBDSM = "M";
        } else {
            this.roleBDSM = "S";
        }
    }

    public void makeHigh() {
        isHigh = true;
    }

    public boolean getSenseIndex(String sense) {
        return senses.indexOf(sense) != -1;
    }

    public void lookFor(Thing you, World world) {
        for(Thing t: world.getThings()) {
            if(t.equals(you)) {
                // I found you!
            }
        }
    }

    public Memory getMemory() {
        return memory;
    }

    public void removeFeeling(String feeling) {
        feelings.remove(feeling);
    }

    public int getOpinionIndex(String opinion) {
        return opinions.indexOf(new Opinion(opinion, false));
    }

    public void setOpinion(int index, boolean opinionValue) {
        opinions.get(index).setValue(opinionValue);
    }

    public void sendAnnouncement(String announcement) {
        announcementsReceived.add(announcement);
    }

    public void execute() {
    }

    public Execution toExecution() {
        Execution execution = new Execution();
        execution.addArg("me");
        execution.addArg("you");
        return execution;
    }

    public void setExecution(Execution execution) {
        this.execution = execution;
    }

    public void escape(World world) {
        world.unlock(this);
        world.removeThing(this);
    }

    public void escape(String feeling) {
        feelings.remove(feeling);
    }

    public void learnTopic(String topic) {
        topicsLearned.add(topic);
    }


    public void takeExam(String topic) {
        examsTaken.add(topic);
    }

    public String getAlgebraicExpression(String feeling) {
        if(feeling.equals("love")) {
            return "2(2X-i) > 4X – 6U";
        }
        return "";
    }
}
