package project;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Field own = new Field(new ArrayList<>());

        Field rival = new Field("input.txt");
        own.setValue(1, 1, Field.CRASHED_SHIP);
        View view = new View(own, rival);
        Controller ctrl = new Controller(own, rival, view);
        view.setController(ctrl);
        view.setVisible(true);
    }
}
