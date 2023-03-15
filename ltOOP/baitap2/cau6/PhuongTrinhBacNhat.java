public class PhuongTrinhBacNhat {
    private int a;
    private int b;

    public PhuongTrinhBacNhat() {
        this.a = 0;
        this.b = 0;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public PhuongTrinhBacNhat(PhuongTrinhBacNhat t) {
        this.a = t.a;
        this.b = t.b;
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    public void giaiPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            Double x = (double) -b / a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
    }

    public String toString() {
        return "" + this.a + "x+" + this.b + "y=0";
    }
}