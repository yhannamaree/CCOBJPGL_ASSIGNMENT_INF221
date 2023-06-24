package Planets;

import Explorer.Explorers;

public class Mars implements Planets {
    @Override
    public void accept(Explorers explorer) {
        explorer.visit(this);
    }
}
