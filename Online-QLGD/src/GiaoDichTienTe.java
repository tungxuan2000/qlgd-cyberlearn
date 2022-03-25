import java.util.Scanner;

/*
 * Mục đích: Quản lý các nghiệp vụ liên quan giao dịch tiền tệ
 * 
 * */
public class GiaoDichTienTe extends GiaoDich {

	// 1. Attributes
	private float tiGia;
	private int loaiTienTe;
	// 2. Get, set methods

	/**
	 * @return the tiGia
	 */
	public float getTiGia() {
		return tiGia;
	}

	/**
	 * @param tiGia the tiGia to set
	 */
	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}

	/**
	 * @return the loaiTienTe
	 */
	public int getLoaiTienTe() {
		return loaiTienTe;
	}

	/**
	 * @param loaiTienTe the loaiTienTe to set
	 */
	public void setLoaiTienTe(int loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}

	// 3. Constructors
	public GiaoDichTienTe() {

	}

	public GiaoDichTienTe(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, float tiGia,
			int loaiTienTe) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiTienTe = loaiTienTe;
		this.tiGia = tiGia;
	}

	// 4. Input, output methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập tỉ giá: ");
		this.tiGia = Float.parseFloat(scan.nextLine());
		System.out.print(" Nhập loại tiền tệ (1. VND, 2. USD , 3. EURO");
		this.loaiTienTe = Integer.parseInt(scan.nextLine());
	}

	@Override
	public void xuat() {
		String temp = "";
		if (this.loaiTienTe == 1) {
			temp = " VND";
		} else if (this.loaiTienTe == 2) {
			temp = " USD";
		} else {
			temp = "EURO";
		}
		super.xuat();
		System.out.println("\t Tiền:" + temp + "\t Tỉ giá: " + this.tiGia + "\t Thành tiền: " + this.thanhTien);
	}
	// 5. Business methods

	@Override
	public void tinhTien() {
		if (this.loaiTienTe == 1) {
			this.thanhTien = this.soLuong * this.donGia;
		} else {
			this.thanhTien = this.soLuong * this.donGia * this.tiGia;
		}
	}

}
