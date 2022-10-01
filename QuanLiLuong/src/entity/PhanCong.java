package entity;

import java.util.Date;

public class PhanCong {

	private CongNhan congNhan;
	private CongDoan congDoan;
	private Date ngayKetThuc;
	private int chiTieu;
	private int soLuongLamDuoc;

	public PhanCong(CongNhan congNhan, CongDoan congDoan, Date ngayKetThuc, int chiTieu, int soLuongLamDuoc) {
		this.congNhan = congNhan;
		this.congDoan = congDoan;
		this.ngayKetThuc = ngayKetThuc;
		this.chiTieu = chiTieu;
		this.soLuongLamDuoc = soLuongLamDuoc;
	}

	public PhanCong() {
	}

	public CongNhan getCongNhan() {
		return congNhan;
	}

	public CongDoan getCongDoan() {
		return congDoan;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public int getChiTieu() {
		return chiTieu;
	}

	public int getSoLuongLamDuoc() {
		return soLuongLamDuoc;
	}

	public void setCongNhan(CongNhan congNhan) {
		this.congNhan = congNhan;
	}

	public void setCongDoan(CongDoan congDoan) {
		this.congDoan = congDoan;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public void setChiTieu(int chiTieu) {
		this.chiTieu = chiTieu;
	}

	public void setSoLuongLamDuoc(int soLuongLamDuoc) {
		this.soLuongLamDuoc = soLuongLamDuoc;
	}

	// kiểm tra công đoạn trước hoàn thành đủ số lượng chưa
	public boolean kiemTraCongDoan() {
		return false;
	}

	// đánh giá việc hoàn thành chỉ tiêu đúng thời hạn không
	public boolean danhGiaHoanThanh() {
		return false;
	}

}
