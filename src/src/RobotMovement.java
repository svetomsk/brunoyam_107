public class RobotMovement {
    private static final int EMPTY = 2;
    private static final int ROBOT = 4;

    public static void main(String[] args) {
        // создали поле
        int [][] field = new int[5][7];

        // заполняем поле
        for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.println(i + " " + j);
                field[i][j] = EMPTY;
            }
        }

        // создаем робота
        Robot robot = new Robot();

        // отмечаем положение робота на поле
        field[robot.getX()][robot.getY()] = ROBOT;  
    }

    private static void printField(int [][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if(field[i][j] == EMPTY) {
                    System.out.print("_ ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void move(String direction, int steps, Robot r, int [][] field) {
        if(direction.equalsIgnoreCase("right")) {
            // move left
            int x = r.getX();
            int y = r.getY();
            field[x][y] = EMPTY;
            y += steps;
            r.setY(y);
            field[x][y] = ROBOT;
        } else if(direction.equalsIgnoreCase("left")) {

        }
    }
}
