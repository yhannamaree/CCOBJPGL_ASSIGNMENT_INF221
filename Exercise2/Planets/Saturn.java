package Planets;

import Explorer.Explorers;

public class Saturn implements Planets {
    @Override
    public void accept(Explorers explorer) {
        explorer.visit(this);
    }
}
