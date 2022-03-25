import java.util.Scanner;

/*
 * Mục đích: Để quản lý các giao dịch vàng
 * */
public class GiaoDichVang extends GiaoDich {

	//1. Attributes
	private String loaiVang;
	//2. Get, set methods
	
	/**
	 * @return the loaiVang
	 */
	public String getLoaiVang() {
		return loaiVang;
	}

	/**
	 * @param loaiVang the loaiVang to set
	 */
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	//3. Constructors
	
	public GiaoDichVang() {
		
	}

	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiVang = loaiVang;

	}
	//4. Input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập loại vàng:");
		this.loaiVang = scan.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loại vàng: "  + this.loaiVang + "\t Thành Tiền: " + this.thanhTien);
	}
	//5.  Business methods
	
	@Override
	public void tinhTien() {
		this.thanhTien = this.donGia * this.soLuong;
	}
	

}
