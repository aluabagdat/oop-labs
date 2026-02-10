package lab3;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boys = 0;
        int remaining = 0;

        for (Person p : kidnappedPeople) {
            if (p.getGender() == Gender.BOY) {
                boys++;
            } else {
                if (boys > 0) {
                    boys--;
                } else {
                    remaining++;
                }
            }
        }

        remaining += boys;

        return remaining > 0;
    }
}
