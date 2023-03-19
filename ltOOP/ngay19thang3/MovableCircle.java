public class MovableCircle extends Movable {
    private int radius;
    private MovablePoint center = new MovablePoint(1,1,1,1);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center.setX(x);
        this.center.setY(y);
        this.center.setxSpeed(xSpeed);
        this.center.setySpeed(ySpeed);
    }

    public MovablePoint getCenter() {
        return center;
    }

    public MovableCircle(MovableCircle m) {
        this.radius = m.radius;
        this.center = m.center;
    }

    public boolean pointInside(MovablePoint p) {
        if(p.distance(center) <= this.radius)
            return true;
        return false;
    }

    public double getArea(){
        double a = Math.PI* Math.pow(this.radius,2);
        return a;
    }

    public String toString() {
        return center.toString() + ",radius="+this.radius;
    }

    public void moveUp() {
        this.center.moveUp();
    }

    public void moveDown() {
        this.center.moveDown();
    }

    public void moveLeft() {
        this.center.moveLeft();
    }

    public void moveRight() {
        this.center.moveRight();
    }


}