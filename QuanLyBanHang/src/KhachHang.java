import java.util.ArrayList;
import java.util.List;

public class KhachHang {

    private String diaChi;
    private int khachHangID;
    private String tenKH;
    private List<HoaDon> listHoaDon = new ArrayList<>();

    KhachHang(
            String diaChi,
            int khachHangID,
            String tenKH
    ) {
        this.diaChi = diaChi;
        this.khachHangID = khachHangID;
        this.tenKH = tenKH;
    }

    public void ThemHoaDon( HoaDon tmp ) {
        listHoaDon.add(tmp);
    }

    public List<HoaDon> getListHoaDon() {
        return listHoaDon;
    }

    public String getTenKH() {
        return tenKH;
    }
}
