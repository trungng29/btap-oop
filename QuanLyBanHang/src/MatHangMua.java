import java.util.ArrayList;
import java.util.List;

public class MatHangMua {

    private HoaDon hd;
    private int matHangMuaID;
    private MatHang mh;
    private int soLuong;
    private static List<MatHangMua> listMHM = new ArrayList<>();


    MatHangMua(
            HoaDon hd,
            int matHangMuaID,
            MatHang mh,
            int soLuong,
            List<MatHangMua> listMHM
    ) {
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.mh = mh;
        this.soLuong = soLuong;
        this.listMHM = listMHM;
    }

    public void ThemMatHangMuaCuaHoaDon() {
        listMHM.add(new MatHangMua(hd, matHangMuaID, mh, soLuong, listMHM));
    }

}
