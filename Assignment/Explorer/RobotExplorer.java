package Explorer;

import Planets.*;

public class RobotExplorer implements Explorers {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Loading instructions from system... exploring Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Loading instructions from system... exploring Venus");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Loading instructions from system... exploring Jupiter");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Loading instructions from system... exploring Neptune");
    }


}
