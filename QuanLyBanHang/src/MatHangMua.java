import java.util.ArrayList;
import java.util.List;

public class MatHangMua {

    public static List<MatHangMua> listMatHangMua = new ArrayList<>();;

    private HoaDon hd;
    private int matHangMuaID;
    private MatHang mh;
    private int soLuong;

    MatHangMua(
            HoaDon hd,
            int matHangMuaID,
            MatHang mh,
            int soLuong
    ) {
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.mh = mh;
        this.soLuong = soLuong;
    }

    public MatHang getMh() {
        return mh;
    }

    public void ThemMatHangMuaCuaHoaDon() {
        listMatHangMua.add( new MatHangMua(hd, matHangMuaID, mh, soLuong) );
    }

}
