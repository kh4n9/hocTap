import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TAMGIAC a = new TAMGIAC(3,3,3);
        TAMGIAC b = new TAMGIAC(3,3,4);
        TAMGIAC c = new TAMGIAC(3,4,5);
        TAMGIAC d = new TAMGIAC();
        d.input();
        System.out.println("\n");
        a.chuvi();
        b.chuvi();
        c.chuvi();
        d.chuvi();
        System.out.println("\n");
        a.dientich();
        b.dientich();
        c.dientich();
        d.dientich();
        System.out.println("\n");
        a.loai();
        b.loai();
        c.loai();
        d.loai();
    }
}
