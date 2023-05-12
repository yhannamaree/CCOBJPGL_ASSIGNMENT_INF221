package Planets;

import Explorer.Explorers;

public class Uranus implements Planets {
    @Override
    public void accept(Explorers explorer) {
        explorer.visit(this);
    }
}
