class HoaDon {

    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;

    HoaDon (
            int hoaDonID,
            KhachHang kh,
            String ngayBan,
            float tongTien
    ) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
    }

    public void inHoaDon() {
        System.out.println(hoaDonID + " " + kh + " " + ngayBan + " " + tongTien);
    }

    //TODO: Vẫn chưa biết phương thức này triển khai nnao.
    public void themHoaDon() {
        System.out.println("Hoa don da duoc them vs ID: " + hoaDonID);
    }

}