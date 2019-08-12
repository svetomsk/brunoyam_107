public class ClassesExample {

    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.getX());
        int r = robot.getX() * robot.getX() + robot.getY() * robot.getY();
        robot.setX(123);
        System.out.println(r);
        System.out.println(robot.getX());
        robot.setX(-100);
        System.out.println(robot.getX());
    }
}
