package ltOOP.baitap2.cau3;

public class Main {
    public static void main(String[] args) {
        COODINATE d1 = new COODINATE();
        d1.xuat();
        d1.nhap();
        d1.xuat();
        COODINATE d2 = new COODINATE(1,2);
        d2.xuat();
        d1.tong(d2).xuat();
    }
}
