package model;

public class HangHoa {
	private String tenHang;
	private int soLuong;
	private double donGia;

	public HangHoa(String tenHang, int soLuong, double donGia) {
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
}
