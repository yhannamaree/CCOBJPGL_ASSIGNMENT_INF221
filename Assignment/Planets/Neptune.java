package Planets;

import Explorer.Explorers;

public class Neptune implements Planets {
    @Override
    public void accept(Explorers explorer) {
        explorer.visit(this);
    }
}
