package entity;

import java.util.Date;

public class PhieuLuong {
	private Luong maLuong;
	private Date ngayNhanLuong;
	private boolean trangThai;
	
	public PhieuLuong(Luong maLuong) {
		this.maLuong = maLuong;
	}

	public PhieuLuong(Luong maLuong, Date ngayNhanLuong, boolean trangThai) {
		this.maLuong = maLuong;
		this.ngayNhanLuong = ngayNhanLuong;
		this.trangThai = trangThai;
	}

	public PhieuLuong() {
	}

	public Luong getMaLuong() {
		return maLuong;
	}

	public Date getNgayNhanLuong() {
		return ngayNhanLuong;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setMaLuong(Luong maLuong) {
		this.maLuong = maLuong;
	}

	public void setNgayNhanLuong(Date ngayNhanLuong) {
		this.ngayNhanLuong = ngayNhanLuong;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	
	//in phieu luong
	public void inPhieuLuong() {
		
	}

	@Override
	public String toString() {
		return "PhieuLuong [maLuong=" + maLuong + ", ngayNhanLuong=" + ngayNhanLuong + ", trangThai=" + trangThai + "]";
	}
	
	
	
}
