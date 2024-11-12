public class MatHangMua {

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

    public MatHangMua ThemMatHangMuaCuaHoaDon() {
        return new MatHangMua(hd, matHangMuaID, mh, soLuong);
    }

}
