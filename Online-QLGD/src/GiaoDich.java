import java.util.Scanner;

/*
 * Mục đích: Tạo lớp superclass để lưu trữ và xử lý liên quan Giao Dịch
 * */
public class GiaoDich {
	//1. Attributes
	protected int maGiaoDich;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected int soLuong;
	protected float thanhTien;
	//2. Get, set methods
	
	/**
	 * @return the maGiaoDich
	 */
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	/**
	 * @param maGiaoDich the maGiaoDich to set
	 */
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	/**
	 * @return the ngay
	 */
	public int getNgay() {
		return ngay;
	}

	/**
	 * @param ngay the ngay to set
	 */
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	/**
	 * @return the thang
	 */
	public int getThang() {
		return thang;
	}

	/**
	 * @param thang the thang to set
	 */
	public void setThang(int thang) {
		this.thang = thang;
	}

	/**
	 * @return the nam
	 */
	public int getNam() {
		return nam;
	}

	/**
	 * @param nam the nam to set
	 */
	public void setNam(int nam) {
		this.nam = nam;
	}

	/**
	 * @return the donGia
	 */
	public float getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}

	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	/**
	 * @return the thanhTien
	 */
	public float getThanhTien() {
		return thanhTien;
	}

	//3. Constructors
	public GiaoDich() {
		
	}

	/**
	 * @param maGiaoDich
	 * @param ngay
	 * @param thang
	 * @param nam
	 * @param donGia
	 * @param soLuong
	 */
	
	public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong) {
		
		this.maGiaoDich = maGiaoDich;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	//4. Input, out methods
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã: ");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập ngày:");
		this.ngay = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập tháng:");
		this.thang = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập năm:");
		this.nam = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhập số lượng:");
		this.soLuong = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhập đơn giá:");
		this.donGia = Float.parseFloat(scan.nextLine());
	}
	
	public void xuat() {
		System.out.print("Mã:" + this.maGiaoDich +"\t Ngày/tháng/năm: " 
								+ this.ngay + "/" + this.thang + "/" + this.nam 
								+ "\t Số lượng: " + this.soLuong + "\t Đơn gia: " + this.donGia);
	}
	//5. Business methods
	
	public void tinhTien() {
		this.thanhTien = 0;
	}
	

}
