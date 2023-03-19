import java.util.Scanner;
public class NHANVIEN{
 	private String maso,hoten;
    static float lcb;
    static int slnv = 0;
    float hsl;
    public NHANVIEN(){
    	maso=hoten=null;
        lcb=hsl=0.0f;
        slnv++;
    }
    public NHANVIEN(String ma,String ten,float l,float h){
     	maso=ma;hoten=ten;lcb=l;hsl=h;slnv++;   
    }
    public NHANVIEN(NHANVIEN obj){
    	this.maso=obj.maso;this.hoten=obj.hoten;
        this.hsl=obj.hsl;this.lcb=obj.lcb;slnv++;
    }
    public void setHoten(String ten){
        hoten = ten;
    }
    public String getHoten(){
        return hoten;
    }
    public void setMaso(String ma){
        maso = ma;
    }
    public String getMaso(){
        return maso;
    }
    public void setHsl(float heso){
        hsl=heso;
    }
    public float getHsl(){
        return hsl;
    }
    public void input(){
    	Scanner sc = new Scanner(System.in);
        maso=sc.nextLine();
        hoten=sc.nextLine();
        lcb=sc.nextFloat();
        hsl=sc.nextFloat();
        sc.close();
    }
    public void TinhLuong(){
        float t = lcb*hsl;
    	System.out.println("Tien luong: "+t);   
    }
    public void output(){
        System.out.printf("%s - %s - lcb: %.2f - hsl: %.2f\n",maso,hoten,lcb,hsl);
    	TinhLuong();
    }
    static void inSLNV(){
        System.out.println("So luong nv: "+slnv);
    }
}