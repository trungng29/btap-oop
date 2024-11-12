import java.util.ArrayList;
import java.util.List;

public class KhachHang {

    private String diaChi;
    private int khachHangID;
    private String tenKH;
    List<HoaDon> listHoaDon;

    KhachHang(
            String diaChi,
            int khachHangID,
            String tenKH
    ) {
        this.diaChi = diaChi;
        this.khachHangID = khachHangID;
        this.tenKH = tenKH;
        listHoaDon = new ArrayList<>();
    }

    public void inHoaDon() {
        for ( HoaDon tmp: listHoaDon ) {
            System.out.println(tmp);
        }
    }

    public void ThemHoaDon( HoaDon hd ) {
        listHoaDon.add(hd);
    }

}
