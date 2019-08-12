package project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Field own = new Field(new ArrayList<>());
        own.setValue(0, 1, Field.EMPTY);
        own.setValue(0, 2, Field.HIDDEN_EMPTY);
        own.setValue(0, 3, Field.HIDDEN_SHIP);
        own.setValue(0, 4, Field.SHIP);
        own.setValue(0, 5, Field.MISSED);
        own.setValue(0, 6, Field.CRASHED_SHIP);
        Field rival = new Field(new ArrayList<>());
        View view = new View(own, rival);
        Controller ctrl = new Controller(own, rival, view);
        view.setController(ctrl);
        view.setVisible(true);
    }
}
