package entity;

import java.util.Date;

public class ChamCong {

	private NhanSu thongTin;
	private int soNgayNghi;
	private int soNgayNghiPhep;
	private int gioTangCa;
	private Date ngayChamCong;
	
	public ChamCong(NhanSu thongTin, int soNgayNghi, int soNgayNghiPhep, int gioTangCa, Date ngayChamCong) {
		this.thongTin = thongTin;
		this.soNgayNghi = soNgayNghi;
		this.soNgayNghiPhep = soNgayNghiPhep;
		this.gioTangCa = gioTangCa;
		this.ngayChamCong = ngayChamCong;
	}

	public ChamCong(NhanSu thongTin) {
		super();
		this.thongTin = thongTin;
	}
	
	public ChamCong() {
	}

	public NhanSu getThongTin() {
		return thongTin;
	}

	public int getSoNgayNghi() {
		return soNgayNghi;
	}

	public int getSoNgayNghiPhep() {
		return soNgayNghiPhep;
	}

	public int getGioTangCa() {
		return gioTangCa;
	}

	public Date getNgayChamCong() {
		return ngayChamCong;
	}

	public void setThongTin(NhanSu thongTin) {
		this.thongTin = thongTin;
	}

	public void setSoNgayNghi(int soNgayNghi) {
		this.soNgayNghi = soNgayNghi;
	}

	public void setSoNgayNghiPhep(int soNgayNghiPhep) {
		this.soNgayNghiPhep = soNgayNghiPhep;
	}

	public void setGioTangCa(int gioTangCa) {
		this.gioTangCa = gioTangCa;
	}

	public void setNgayChamCong(Date ngayChamCong) {
		this.ngayChamCong = ngayChamCong;
	}
	
	// tính lương 1 ngày công của công nhân và nhân viên
	public float tinhLuong() {
		return 0;
	}
	// tính tiền tăng ca
	public float tinhTienTangCa() {
		return 0;
	}
	// tính tiền chuyên cần
	public float tinhTienChuyenCan() {
		return 0;
	}
	
}
