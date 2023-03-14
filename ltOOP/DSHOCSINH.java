import java.util.Scanner;

public class DSHOCSINH {
    private HOCSINH ds[];
    private int sl;
    private Scanner sc = new Scanner(System.in);
    
    public DSHOCSINH() {
    }

    public DSHOCSINH(HOCSINH[] ds, int sl) {
        this.ds = ds;
        this.sl = sl;
    }

    public HOCSINH[] getDs() {
        return ds;
    }

    public void setDs(HOCSINH[] ds) {
        this.ds = ds;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public void nhapDS() {
        System.out.print("so luong: ");
        this.sl = sc.nextInt();

        ds = new HOCSINH[this.sl];

        for(int i=0; i<this.sl; i++) {
            ds[i] = new HOCSINH();
            ds[i].input();
        }
    }

    public void xuatDS() {
        System.out.println("Danh sach sinh vien la:\n");
        for(int i=0; i<this.sl; i++) {
            ds[i].output();
        }
    }

    public void sapXep() {
        for(int i=0; i<this.sl-1; i++) {
            for(int j=i+1; j<this.sl; j++) {
                if(ds[i].getDtb() > ds[j].getDtb()) {
                    HOCSINH temp = new HOCSINH();
                    temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}