package entity;

import java.util.ArrayList;
import java.util.Objects;

public class SanPham {

	private String maSanPham;
	private String tenSanPham;
	private float donGia;
	private LoaiSanPham loaiSanPham;
	private ArrayList<CongDoan> ds;
	
	public SanPham() {
	}

	public SanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public SanPham(String maSanPham, String tenSanPham, float donGia, LoaiSanPham loaiSanPham) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.loaiSanPham = loaiSanPham;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public float getDonGia() {
		return donGia;
	}

	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSanPham);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(maSanPham, other.maSanPham);
	}
	
	//lấy danh sách công đoạn của sản phẩm
	public ArrayList<CongDoan> getDanhSachCongDoan(){
		return ds;
	}
	//thêm 1 công đoạn cho sản phẩm
	public boolean themCongDoan() {
		return false;
	}
	//xóa công đoạn chọn ra khỏi sản phẩm
	public boolean xoaCongDoan(String maCD) {
		return false;
	}
	//chỉnh sửa thông tin công đoạn
	public boolean suaCongDoan(String maCD) {
		return false;
	}
	
}
