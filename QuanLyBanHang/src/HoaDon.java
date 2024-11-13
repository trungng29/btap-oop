import java.util.ArrayList;
import java.util.List;

public class HoaDon {

    public static List<HoaDon> listHoaDon = new ArrayList<>();

    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private Float tongTien = 0.0f;
    private List<MatHangMua> listMua = new ArrayList<>();

    public HoaDon(int hoaDonID, KhachHang kh, String ngayBan) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
    }

    public void setListMua(List<MatHangMua> listMua) {
        this.listMua = listMua;
    }

    public void setTongTien() {
        for ( MatHangMua tmp: listMua ) {
            tongTien += tmp.getMh().getGia();
        }
    }

    public void InHoaDon() {
        System.out.println("_________________________________");
        System.out.println("Id cua hoa don: " + hoaDonID);
        System.out.println("Ten khach hang: " + kh.getTenKH());
        System.out.println("Ngay Ban: " + ngayBan );
        System.out.println("Tong tien mua: " + tongTien);
        System.out.println("_________________________________");
    }

    public void ThemHoaDon() {
        listHoaDon.add( new HoaDon( hoaDonID, kh, ngayBan ) );
    }

}
