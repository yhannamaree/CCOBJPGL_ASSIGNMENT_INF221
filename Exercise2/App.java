import Explorer.Explorers;
import Explorer.HumanExplorer;
import Explorer.RobotExplorer;
import Explorer.Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planets mars = new Mars();
        Planets saturn = new Saturn();
        Planets mercury = new Mercury();
        Planets venus = new Venus();
        Planets earth = new Earth();
        Planets jupiter = new Jupiter();
        Planets uranus = new Uranus();
        Planets neptune = new Neptune();

        Explorers astronaut = new HumanExplorer();
        Explorers rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);
    
}

}
