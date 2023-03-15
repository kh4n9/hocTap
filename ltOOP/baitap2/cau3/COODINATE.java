package ltOOP.baitap2.cau3;

import java.util.Scanner;

public class COODINATE {
    private int x;
    private int y;
    private Scanner sc = new Scanner(System.in);


    public COODINATE() {
        this.x = 0;
        this.y = 0;
    }
    public COODINATE(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public COODINATE tong(COODINATE p) {
        COODINATE kq = new COODINATE();

        kq.x = this.x + p.x;
        kq.y = this.y + p.y;

        return kq;
    }

    public COODINATE doiXungX() {
        COODINATE kq = new COODINATE();

        kq.x = this.x;
        kq.y = 0-this.y;

        return kq;
    }

    public void nhap() {
        System.out.print("x = ");
        this.x = sc.nextInt();
        System.out.print("y = ");
        this.y = sc.nextInt();
    }

    public void xuat() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
}
