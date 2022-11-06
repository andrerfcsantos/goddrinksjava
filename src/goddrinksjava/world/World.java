package goddrinksjava.world;

import java.util.ArrayList;
import java.util.List;

public class World {
    protected List<Thing> things = new ArrayList<>();
    protected int seed;

    protected List<Thing> executionRequests = new ArrayList<>();
    protected List<Thing> lockedThings = new ArrayList<>();

    public World(int seed) {
        this.seed = seed;
    }

    public void addThing(Thing thing) {
        things.add(thing);
    }

    public void startSimulation() {
    }

    public void unite(Thing me, Thing you) {
    }

    public void requestExecution(Thing thing) {
        executionRequests.add(thing);
    }

    public void lockThing(Thing thing) {
        lockedThings.add(thing);
    }

    public Thing getGod() {
        return things.get(0);
    }

    public void procreate(Thing me, Thing you) {
        Thing child = new Thing(me, you);
        addThing(child);
    }

    public void makeHigh(Thing thing) {
        thing.makeHigh();
    }

    public void unlock(Thing thing) {
        lockedThings.remove(thing);
    }

    public void removeThing(Thing thing) {
        things.remove(thing);
    }

    public List<Thing> getThings() {
        return things;
    }


    public static String translate(String text, String language) {
        return text;
    }

    public void announce(String announcement) {
        System.out.println(announcement);
        for(Thing t: things) {
            t.sendAnnouncement(announcement);
        }
    }

    public void announce(String announcement, String language) {
        String translation = translate(announcement, language);
        announce(translation);
    }

    public void runExecution() {
        for(Thing t: things) {
            t.execute();
        }
    }

    public boolean isExecutableBy(Thing thing) {
        return true;
    }

    public int geThingIndex(Thing thing) {
        return things.indexOf(thing);
    }
}
