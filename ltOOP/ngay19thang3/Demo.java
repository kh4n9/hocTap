public class Demo {
    public static void main(String[] args) {
        MovableCircle c = new MovableCircle(0, 0, 1, 1, 4);
        MovablePoint p = new MovablePoint(2, 3, 1, 1);

        if(c.pointInside(p)) {
            System.out.println("Diem nay nam ben trong vong tron");
        }
        else System.out.println("Diem nay khong nam trong hinh tron");

        System.out.println("Dien tich = " + c.getArea());

        System.out.println(c.toString());
        c.moveUp();
        System.out.println(c.toString());
        c.moveDown();
        System.out.println(c.toString());
        c.moveLeft();
        System.out.println(c.toString());
        c.moveRight();
        System.out.println(c.toString());
    }
}
