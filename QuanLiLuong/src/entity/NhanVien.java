package entity;

import java.util.Date;

public class NhanVien extends NhanSu {

	// private thongTin NhanSu;
	private PhongBan phongBan;
	private float luongCoBan;

	public NhanVien(String maSo, String hoTen, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam, String diaChi,
			String eMail, String soDT, String soTKNH, ChucVu chucVu, String urlHinhAnh) {
		super(maSo, hoTen, gioiTinh, ngaySinh, ngayVaoLam, diaChi, eMail, soDT, soTKNH, chucVu, urlHinhAnh);
	}

	public NhanVien(String maSo, String hoTen, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam, String diaChi,
			String eMail, String soDT, String soTKNH, ChucVu chucVu, String urlHinhAnh, PhongBan phongBan, float luongCoBan) {
		super(maSo, hoTen, gioiTinh, ngaySinh, ngayVaoLam, diaChi, eMail, soDT, soTKNH, chucVu, urlHinhAnh);
		this.phongBan = phongBan;
		this.luongCoBan = luongCoBan;
	}

	public NhanVien(String maSo) {
		super(maSo);
	}

	public PhongBan getPhongBan() {
		return phongBan;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	// tính lương cơ bản hiện tai: qua từng năm lương cơ bản sẽ tăng
	public float luongCoBanHienTai() {
		return 0;
	}

}
