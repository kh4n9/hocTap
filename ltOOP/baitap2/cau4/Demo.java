import java.util.Scanner;
public class Demo{
	public static void main(String[] arg){
        NHANVIEN nv1 = new NHANVIEN(),nv2 = new NHANVIEN("nv2","quy",500,2.5f),nv3= new NHANVIEN(nv2);
        NHANVIEN nv = new NHANVIEN();
        nv.input();
        nv.output();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nHo ten moi: ");
        String hoten = sc.nextLine();
        sc.close();
        nv.setHoten(hoten);
        nv.output();
        float max = nv1.getHsl();
        if(nv2.getHsl() > max) max=nv2.getHsl();
        else if(nv3.getHsl > max) max=nv3.getHsl();
        System.out.println("Nhan vien co HSL lon nhat la: ");
        if(max==nv1.getHsl()) nv1.output();
        else{ 	if(max==nv2.getHsl()) nv2.output();
        		else nv3.output();
            }
        nv.inSLNV();
    }
}