import java.util.ArrayList;
import java.util.List;

public class KhachHang {

    private String diaChi;
    private int khachHangID;
    private String tenKH;
//    private List<HoaDon> listHoaDon = new ArrayList<>();

    KhachHang(
            String diaChi,
            int khachHangID,
            String tenKH
//            List<HoaDon> listHoaDon
    ) {
        this.diaChi = diaChi;
        this.khachHangID = khachHangID;
        this.tenKH = tenKH;
//        this.listHoaDon = listHoaDon;
    }

    public String getTenKH() {
        return tenKH;
    }
}
