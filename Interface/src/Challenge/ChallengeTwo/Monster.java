package Challenge.ChallengeTwo;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Player {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        super(name, hitPoints, strength);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public int getHitPoints() {
        return super.getHitPoints();
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues == null)
            return;
        if (savedValues.size() <= 0)
            return;
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" +
                getName() + "', hitPoints=" +
                getHitPoints() + ", strength=" +
                getStrength() + "}";
    }
}
