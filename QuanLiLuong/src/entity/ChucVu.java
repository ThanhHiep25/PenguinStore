package entity;

import java.util.Objects;

public class ChucVu {

	private String maChucVu;
	private String tenChucVu;
	private float heSoLuong;

	public ChucVu() {
	}

	public ChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}

	public ChucVu(String maChucVu, String tenChucVu, float heSoLuong) {
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
		this.heSoLuong = heSoLuong;
	}

	public String getMaChucVu() {
		return maChucVu;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maChucVu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChucVu other = (ChucVu) obj;
		return Objects.equals(maChucVu, other.maChucVu);
	}

}
