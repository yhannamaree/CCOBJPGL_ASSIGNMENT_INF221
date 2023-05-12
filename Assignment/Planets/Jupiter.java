package Planets;

import Explorer.Explorers;

public class Jupiter implements Planets {
    @Override
    public void accept(Explorers explorer) {
        explorer.visit(this);
    }
}
