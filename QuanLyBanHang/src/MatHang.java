import java.util.ArrayList;
import java.util.List;

public class MatHang {

    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMatHang;

    public void ThemMatHangVaoKho(
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

    @Override
    public String toString() {
        return matHangID + " " + tenMatHang + " "+ gia + " " + soLuong;
    }

}
