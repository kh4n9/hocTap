package ltOOP.baitap2.cau4;

import java.util.Scanner;

public class NHANVIEN {
    private String maso, hoten;
    private static float lcb;
    private static int slnv = 0;
    private float hsl;
    Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    
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
    public static float getLcb() {
        return lcb;
    }
    public static void setLcb(float lcb) {
        NHANVIEN.lcb = lcb;
    }
    public static int getSlnv() {
        return slnv;
    }
    public static void setSlnv(int slnv) {
        NHANVIEN.slnv = slnv;
    }
    public float getHsl() {
        return hsl;
    }
    public void setHsl(float hsl) {
        this.hsl = hsl;
    }
    public NHANVIEN() {
        slnv++;
    }
    public NHANVIEN(NHANVIEN temp) {
        this.hoten = temp.hoten;
        this.hsl = temp.hsl;
        this.maso = temp.maso;
        slnv++;
    }
    public NHANVIEN(String maso, String hoten, float hsl) {
        this.maso = maso;
        this.hoten = hoten;
        this.hsl = hsl;
        slnv++;
    }
    public static void nhapLCB() {
        System.out.print("lcb: ");
        lcb = sc2.nextFloat();
    }

    public void nhap() {
        System.out.print("ma so: ");
        this.maso = sc.nextLine();
        System.out.print("ho ten: ");
        this.hoten = sc.nextLine();
        nhapLCB();
        System.out.print("hsl: ");
        this.hsl = sc.nextFloat();
    }
    public void xuat() {
        System.out.println("ma so: " + this.maso);
        System.out.println("ho ten: " + this.hoten);
        inLBC();
        System.out.println("hsl: " + this.hsl);
    }
    public static void inSLNV() {
        System.out.println("So luong nv: " + slnv);
    }
    public static void inLBC() {
        System.out.println("lcb: " + lcb);
    }
}
