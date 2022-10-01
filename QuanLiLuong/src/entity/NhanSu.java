package entity;

import java.util.Date;
import java.util.Objects;

public class NhanSu {

	protected String maSo;
	protected String hoTen;
	protected boolean gioiTinh;
	protected Date ngaySinh;
	protected Date ngayVaoLam;
	protected String diaChi;
	protected String eMail;
	protected String soDT;
	protected String soTKNH;
	protected ChucVu chucVu;
	protected String urlHinhAnh;

	public NhanSu() {
	}

	public NhanSu(String maSo) {
		this.maSo = maSo;
	}

	public NhanSu(String maSo, String hoTen, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam, String diaChi,
			String eMail, String soDT, String soTKNH, ChucVu chucVu, String urlHinhAnh) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.ngayVaoLam = ngayVaoLam;
		this.diaChi = diaChi;
		this.eMail = eMail;
		this.soDT = soDT;
		this.soTKNH = soTKNH;
		this.chucVu = chucVu;
		this.urlHinhAnh = urlHinhAnh;
	}

	public String getMaSo() {
		return maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String geteMail() {
		return eMail;
	}

	public String getSoDT() {
		return soDT;
	}

	public String getSoTKNH() {
		return soTKNH;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public void setSoTKNH(String soTKNH) {
		this.soTKNH = soTKNH;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public String getUrlHinhAnh() {
		return urlHinhAnh;
	}

	public void setUrlHinhAnh(String urlHinhAnh) {
		this.urlHinhAnh = urlHinhAnh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanSu other = (NhanSu) obj;
		return Objects.equals(maSo, other.maSo);
	}

}
