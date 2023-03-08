package BT_1;
public abstract class HinhHoc {
    private String Color = "trắng";

    public HinhHoc() {
    }

    public HinhHoc(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return "HinhHoc{" +
                "Color='" + Color + '\'' +
                '}';
    }
}



