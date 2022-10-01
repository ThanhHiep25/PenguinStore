package entity;

import java.util.Objects;

public class Luong {

	private NhanSu nhanSu;
	private String maLuong;
	
	public Luong() {
	}

	public Luong(NhanSu nhanSu, String maLuong) {
		this.nhanSu = nhanSu;
		this.maLuong = maLuong;
	}

	public NhanSu getNhanSu() {
		return nhanSu;
	}

	public String getMaLuong() {
		return maLuong;
	}

	public void setNhanSu(NhanSu nhanSu) {
		this.nhanSu = nhanSu;
	}

	public void setMaLuong(String maLuong) {
		this.maLuong = maLuong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maLuong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Luong other = (Luong) obj;
		return Objects.equals(maLuong, other.maLuong);
	}
	
	//
	public void getTienLuongCoBan() {
	
	}
	public void getTienTangCa() {
		
	}
	public void getTienChuyenCan() {
		
	}
	public float tienTroCap() {
		return 0;
	}
	public float tienBaoHiem() {
		return 0;
	}
	public float tienThue() {
		return 0;
	}
	public float tinhTongLuong() {
		return 0;
	}
	
}
