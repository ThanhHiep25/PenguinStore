package entity;

import java.util.ArrayList;
import java.util.Objects;

public class PhongBan {

	private String maPhong;
	private String tenPhong;
	private ArrayList<NhanVien> ds;

	public PhongBan() {
	}

	public PhongBan(String maPhong) {
		this.maPhong = maPhong;
	}

	public PhongBan(String maPhong, String tenPhong) {
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongBan other = (PhongBan) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
	//lấy danh sách nhân viên trong phòng ban
	public ArrayList<NhanVien> getDanhSachNhanVien(){
		return ds;
	}
	//kiểm tra số lượng nhân viên đạt giới hạn chưa
	public boolean kiemTraSoLuongNhanVien() {
		return false;
	}
	//thêm nhân viên vào phòng 
	public boolean themNhanVien(String maNV) {
		return false;
	}
	//chuyển nhân viên khỏi phòng
	public boolean chuyenNhanVien(String maNV) {
		return false;
	}
}
