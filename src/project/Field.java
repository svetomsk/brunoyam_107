package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Field implements IField {
    public static final int EMPTY = 0;
    public static final int HIDDEN_EMPTY = 1;
    public static final int MISSED = 2;
    public static final int SHIP = 3;
    public static final int HIDDEN_SHIP = 4;
    public static final int CRASHED_SHIP = 5;
    public static final int DEFAULT_SIZE = 10;
    private int[][] data;

    public Field(String filename) throws FileNotFoundException {
        data = new int[DEFAULT_SIZE][DEFAULT_SIZE];
        initFieldFromFile(filename);
    }

    private void initFieldFromFile(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        String line = sc.nextLine();
        int lineNumber = 0;
        while (line != null) {
            System.out.println(line);

            for (int j = 0; j < line.length(); j++) {
                char current = line.charAt(j);
                if (current == '*') {
                    data[lineNumber][j] = HIDDEN_SHIP;
                } else if (current == '-') {
                    data[lineNumber][j] = HIDDEN_EMPTY;
                }
            }
            lineNumber++;
            if(sc.hasNext())
                line = sc.nextLine();
            else {
                break;
            }
        }
    }

    public Field(List<Ship> ships) {
        data = new int[10][10];
        if (!checkShips(ships)) {
            throw new IllegalArgumentException("Incorrect ships position");
        }
    }

    private boolean IncorrectRange(int x, int y) {
        return x <= 0 || x > 10 || y <= 0 || y > 10;
    }

    private boolean checkShips(List<Ship> ships) {
        for (Ship ship : ships) {
            int x = ship.getX();
            int y = ship.getY();
            if (ship.isHorizontal()) {
                for (int i = 0; i < ship.getSize(); i++) {
                    if (IncorrectRange(x, y + i) || data[x][y + i] != EMPTY) {
                        return false;
                    }
                    data[x][y + i] = SHIP;
                }
            } else {
                for (int i = 0; i < ship.getSize(); i++) {
                    if (IncorrectRange(x + i, y) || data[x + i][y] != EMPTY) {
                        return false;
                    }
                    data[x + i][y] = SHIP;
                }
            }
        }
        return true;
    }

    @Override
    public void setValue(int x, int y, int value) {
        data[x][y] = value;
    }

    @Override
    public int getValue(int x, int y) {
        return data[x][y];
    }

    @Override
    public int size() {
        return 10;
    }

    @Override
    public boolean isAllCrashed() {
        return false;
    }
}
