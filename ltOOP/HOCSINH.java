import java.util.Scanner;

public class HOCSINH {
    private String maso;
    private String hoten;
    private float dtb;
    private Scanner sc = new Scanner(System.in);

    public HOCSINH() {
    }

    public HOCSINH(String maso, String hoten, float dtb) {
        this.maso = maso;
        this.hoten = hoten;
        this.dtb = dtb;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public void input() {
        System.out.print("ma so: ");
        this.maso = this.sc.nextLine();
        System.out.print("ho ten: ");
        this.hoten = this.sc.nextLine();
        System.out.print("dtb: ");
        this.dtb = this.sc.nextFloat();
    }

    public void output() {
        System.out.println("ma so: " + this.maso);
        System.out.println("ho ten: " + this.hoten);
        System.out.println("dtb: " + this.dtb);
    }

    public void rank() {
        if(this.dtb > 5)
            System.out.println("Yeu");
        else if(this.dtb > 6.5)
            System.out.println("Trung Binh");
        else if(this.dtb > 8)
            System.out.println("Kha");
        else if(this.dtb > 9)
            System.out.println("Gioi");
        else
            System.out.println("Xuat sac");
    }
}