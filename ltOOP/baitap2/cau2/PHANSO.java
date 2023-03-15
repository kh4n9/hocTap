import java.util.Scanner;

public class PHANSO {
    private int tu;
    private int mau;
    private Scanner sc = new Scanner(System.in);
    
    public PHANSO() {
    }
    public PHANSO(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PHANSO(PHANSO ps) {
        this.tu = ps.tu;
        this.mau = ps.mau;
    }
    public int getTu() {
        return tu;
    }
    public void setTu(int tu) {
        this.tu = tu;
    }
    public int getMau() {
        return mau;
    }
    public void setMau(int mau) {
        this.mau = mau;
    }

    public void nhapPS() {
        System.out.print("nhap tu: ");
        this.tu = sc.nextInt();
        System.out.print("nhap mau: ");
        this.mau = sc.nextInt();
    }

    public void xuatPS() {
        System.out.println("" + this.tu + "/" + this.mau);
    }

    public int UCLN(int a, int b) {
        if(a==b) return a;
        if(a>b) return UCLN(a-b,b);
        else return  UCLN(a,b-a);
    }

    public void rutGon() {
        int tam = UCLN(this.tu, this.mau);

        this.tu/=tam;
        this.mau/=tam;
    }

    public PHANSO cong(PHANSO p) {
        PHANSO kq = new PHANSO();

        kq.mau = this.mau * p.mau;
        kq.tu = this.tu * p.mau + p.tu * this.mau;

        kq.rutGon();

        return kq;
    }

    public PHANSO tru(PHANSO p) {
        PHANSO kq = new PHANSO();

        kq.mau = this.mau * p.mau;
        kq.tu = this.tu * p.mau - p.tu *this.mau;

        kq.rutGon();

        return kq;
    }

    public PHANSO nhan(PHANSO p) {
        PHANSO kq = new PHANSO();

        kq.mau = this.mau * p.mau;
        kq.tu = this.tu * p.tu;

        kq.rutGon();

        return kq;
    }

    public PHANSO chia(PHANSO p) {
        PHANSO kq = new PHANSO();

        kq.mau = this.mau * p.tu;
        kq.tu = this.tu * p.mau;

        kq.rutGon();

        return kq;
    }
}