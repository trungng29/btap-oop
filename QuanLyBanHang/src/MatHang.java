import java.util.ArrayList;
import java.util.List;

public class MatHang {

    public static List<MatHang> listMatHang = new ArrayList<>();

    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMatHang;

    MatHang(
            float gia,
            int matHangID,
            int soLuong,
            String tenMatHang
    ) {
        this.gia = gia;
        this.matHangID = matHangID;
        this.soLuong = soLuong;
        this.tenMatHang = tenMatHang;
    }

    public float getGia() {
        return gia;
    }

    public void ThemMatHangVaoKho() {
        listMatHang.add( new MatHang(gia, matHangID, soLuong, tenMatHang) );
    }

}
