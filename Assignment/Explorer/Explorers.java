package Explorer;

import Planets.Mars;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Venus;
import Planets.Jupiter;
import Planets.Uranus;
import Planets.Earth;
import Planets.Neptune;
import Planets.Planets;

public interface Explorers {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Venus venus);

    void visit(Earth earth);

    void visit(Jupiter jupiter);

    void visit(Uranus uranus);

    void visit(Neptune neptune);


    default void visit(Planets planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
