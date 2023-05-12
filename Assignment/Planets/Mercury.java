package Planets;

import Explorer.Explorers;

public class Mercury implements Planets {
    @Override
    public void accept(Explorers explorer) {
        explorer.visit(this);
    }
}
