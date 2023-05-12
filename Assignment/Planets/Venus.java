package Planets;

import Explorer.Explorers;

public class Venus implements Planets {
    @Override
    public void accept(Explorers explorer) {
        explorer.visit(this);
    }
}    
