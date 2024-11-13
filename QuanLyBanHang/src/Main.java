import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MatHang x = new MatHang(20.0f, 1, 20, "Mat hang x");
        MatHang y = new MatHang(15.0f, 2, 10, "Mat hang y");
        MatHang z = new MatHang(300.0f, 3, 5, "Mat hang z");

        KhachHang NVA = new KhachHang("89 Lac Long Quan", 111, "Nguyen Van A");

        HoaDon hoaDonNVA = new HoaDon(200, NVA, "13-11-2024");

        List<MatHangMua> tmp = new ArrayList<>();

        tmp.add( new MatHangMua(hoaDonNVA, 500, x, 1));
        tmp.add( new MatHangMua(hoaDonNVA, 501, y, 2));

        hoaDonNVA.setListMua(tmp);
        hoaDonNVA.setTongTien();

        hoaDonNVA.InHoaDon();

    }
}
