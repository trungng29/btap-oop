import java.util.ArrayList;
import java.util.List;

class HoaDon {

    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    List<MatHangMua> listMatHangMua;

    public void ThemHoaDon (
            int hoaDonID,
            KhachHang kh,
            String ngayBan,
            float tongTien
    ) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
        this.listMatHangMua = new ArrayList<>();
    }



    public String InHoaDon() {
        return hoaDonID + " " + kh + " " + ngayBan + " " + tongTien;
    }

}