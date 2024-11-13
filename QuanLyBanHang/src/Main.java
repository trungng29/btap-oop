import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MatHang x = new MatHang();
        x.ThemMatHangVaoKho(
                20.0F,
                1,
                10,
                "x"
        );

        MatHang y = new MatHang();
        y.ThemMatHangVaoKho(
                45.0F,
                2,
                50,
                "y"
        );

        MatHang z = new MatHang();
        z.ThemMatHangVaoKho(
                300.5F,
                3,
                4,
                "z"
        );

        KhachHang NVA = new KhachHang(
                "89 Lac Long Quan",
                292,
                "Nguyen Van A"
        );

        HoaDon hd1 = new HoaDon();
        hd1.ThemHoaDon(1, NVA, "13-11-2024", 200_000 );



    }

}