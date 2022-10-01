package entity;

import java.util.Date;

public class CongNhan extends NhanSu {

	private ToSanXuat toSanXuat;
	private String vaiTro;
	//private NhanSu thongTin;


	public CongNhan(String maSo, String hoTen, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam, String diaChi,
			String eMail, String soDT, String soTKNH, ChucVu chucVu, String urlHinhAnh) {
		super(maSo, hoTen, gioiTinh, ngaySinh, ngayVaoLam, diaChi, eMail, soDT, soTKNH, chucVu, urlHinhAnh);
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String maSo, String hoTen, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam, String diaChi,
			String eMail, String soDT, String soTKNH, ChucVu chucVu, String urlHinhAnh, ToSanXuat toSanXuat, String vaiTro) {
		super(maSo, hoTen, gioiTinh, ngaySinh, ngayVaoLam, diaChi, eMail, soDT, soTKNH, chucVu, urlHinhAnh);
		this.toSanXuat = toSanXuat;
		this.vaiTro = vaiTro;
	}
	
	public CongNhan(String maSo) {
		super(maSo);
	}

	public ToSanXuat getToSanXuat() {
		return toSanXuat;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setToSanXuat(ToSanXuat toSanXuat) {
		this.toSanXuat = toSanXuat;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}

}
