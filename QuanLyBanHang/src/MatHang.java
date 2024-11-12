public class MatHang {

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

    public MatHang ThemMatHangVaoKho() {
        return new MatHang(gia, matHangID, soLuong, tenMatHang);
    }

    @Override
    public String toString() {
        return matHangID + " " + tenMatHang + " "+ gia + " " + soLuong;
    }

}
