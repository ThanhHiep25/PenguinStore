package entity;

import java.util.Objects;

public class CongDoan {

	private String maCongDoan;
	private String tenCongDoan;
	private SanPham sanPham;
	private int thuTu;
	private float heSo;
	
	public CongDoan() {
	}

	public CongDoan(String maCongDoan) {
		this.maCongDoan = maCongDoan;
	}

	public CongDoan(String maCongDoan, String tenCongDoan, SanPham sanPham, int thuTu, float heSo) {
		this.maCongDoan = maCongDoan;
		this.tenCongDoan = tenCongDoan;
		this.sanPham = sanPham;
		this.thuTu = thuTu;
		this.heSo = heSo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(heSo, maCongDoan, sanPham, tenCongDoan, thuTu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CongDoan other = (CongDoan) obj;
		return Float.floatToIntBits(heSo) == Float.floatToIntBits(other.heSo)
				&& Objects.equals(maCongDoan, other.maCongDoan) && Objects.equals(sanPham, other.sanPham)
				&& Objects.equals(tenCongDoan, other.tenCongDoan) && thuTu == other.thuTu;
	}
	
	//tính đơn giá sản phẩm = % hệ số công đoạn * đơn giá của sản phẩm
	public float getDonGia() {
		return 0;
	}
	
}
