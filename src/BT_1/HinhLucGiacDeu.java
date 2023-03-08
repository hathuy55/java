package BT_1;

public class HinhLucGiacDeu extends HinhHoc{
    private  double canh1 = 2.0;

    public HinhLucGiacDeu(double canh1) {
        this.canh1 = canh1;
    }

    public HinhLucGiacDeu(String color, double canh1) {
        super(color);
        this.canh1 = canh1;

    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    @Override
    public String toString() {
        return "HinhLucGiacDeu{" +
                "canh1=" + canh1 +
                '}';
    }

    @Override
    public double tinhChuVi() {
        return 0;
    }

    @Override
    public double tinhDienTich() {
        return 0;
    }
}
