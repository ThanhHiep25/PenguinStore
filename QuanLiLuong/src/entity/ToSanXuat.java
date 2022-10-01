package entity;

import java.util.ArrayList;
import java.util.Objects;

public class ToSanXuat {

	private String maToSX;
	private String tenToSX;
	private ArrayList<CongNhan> ds;

	public ToSanXuat() {
	}

	public ToSanXuat(String maToSX) {
		this.maToSX = maToSX;
	}

	public ToSanXuat(String maToSX, String tenToSX) {
		this.maToSX = maToSX;
		this.tenToSX = tenToSX;
	}

	public String getMaToSX() {
		return maToSX;
	}

	public String getTenToSX() {
		return tenToSX;
	}

	public void setMaToSX(String maToSX) {
		this.maToSX = maToSX;
	}

	public void setTenToSX(String tenToSX) {
		this.tenToSX = tenToSX;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maToSX);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToSanXuat other = (ToSanXuat) obj;
		return Objects.equals(maToSX, other.maToSX);
	}

	// lấy danh sách công nhân trong tổ
	public ArrayList<CongNhan> getDanhSachCongNhan() {
		return ds;
	}
	// kiểm tra số lượng tối công nhân vượt mức chưa
	public boolean kiemTraSoLuongCongNhan() {
		return false;
	}
	// thêm công nhân vào tổ
	public boolean themCongNhan(String maCN) {
		return false;
	}
	// chuyển công nhân khỏi tổ
	public boolean chuyenCongNhan(String maCN) {
		return false;
	}
}
