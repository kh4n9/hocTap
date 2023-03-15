import java.util.Scanner;

public class TAMGIAC {
    int a;
    int b;
    int c;
    Scanner sc = new Scanner(System.in);
    public TAMGIAC() {
    }
    public TAMGIAC(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void input(){
        do{
            System.out.print("a: ");
            a = sc.nextInt();
            System.out.print("b: ");
            b = sc.nextInt();
            System.out.print("c: ");
            c = sc.nextInt();
            if((a+b)<=c || (a+c)<=b || (b+c)<=a){
                System.out.println("Nhap lai!!!");
            }
        }while((a+b)<=c || (a+c)<=b || (b+c)<=a);
    }

    public void chuvi(){
        System.out.println("Chu vi = " + (a + b + c));
    }

    public void dientich(){
        double p = ((a+b+c)*1.0)/2.0;
        System.out.println(p);
        double s = Math.sqrt(p*(p-a*1.0)*(p-b*1.0)*(p-c*1.0));
        System.out.println("Dien tich = " + s);
    }

    public void loai(){
        if(a == b && b == c){
            System.out.println("Tam giac deu");
            return;
        }

        if(a == b || a == c || b == c){
            System.out.println("Tam giac can");
            return;
        }

        if(a == Math.sqrt(Math.pow(b,2)+Math.pow(c,2)) ||
            b == Math.sqrt(Math.pow(a,2)+Math.pow(c,2)) ||
            c == Math.sqrt(Math.pow(a,2)+Math.pow(b,2))){
            System.out.println("Tam giac vuong");
        }
        else{
            System.out.println("Tam giac thuong");
        }
    }
}
