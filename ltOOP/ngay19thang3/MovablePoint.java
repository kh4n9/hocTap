public class MovablePoint extends Movable{
    private int x, y, xSpeed, ySpeed;

    public MovablePoint() {
        this.x = 1;
        this.y = 1;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double distance(MovablePoint p) {
        double kq = Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y, 2));
        return kq;
    }

    public String toString() {
        return "("+this.x+","+this.y+"),speed=("+this.xSpeed+","+this.ySpeed+")";
    }

    public void moveUp() {
        this.y+=this.ySpeed;
    }

    public void moveDown() {
        this.y-=this.ySpeed;
    }

    public void moveLeft() {
        this.x-=this.xSpeed;
    }

    public void moveRight() {
        this.x+=this.xSpeed;
    }
}