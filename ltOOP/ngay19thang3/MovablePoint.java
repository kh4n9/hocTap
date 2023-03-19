public class MovablePoint extends Movable{
    private int x, y, xSpeed, ySpeed;

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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
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