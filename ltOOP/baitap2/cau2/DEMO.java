import java.util.Scanner;

public class DEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PHANSO p1 = new PHANSO();
        p1.xuatPS();
        p1.nhapPS();
        p1.xuatPS();
        PHANSO p2 = new PHANSO(4, 16);
        p2.xuatPS();
        PHANSO p3 = new PHANSO(sc.nextInt(),sc.nextInt());
    }
}
