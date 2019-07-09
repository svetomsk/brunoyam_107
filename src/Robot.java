public class Robot {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x < 0) {
            System.out.println("Wrong value");
            return;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
