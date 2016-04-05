package entities;
// Generated Apr 5, 2016 10:07:51 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Chitiethoadon generated by hbm2java
 */
@Entity
@Table(name = "chitiethoadon", catalog = "quanlynhahang")
public class Chitiethoadon implements java.io.Serializable {

	private Integer maCthd;
	private Hoadon hoadon;
	private Menu menu;
	private String tenGoi;
	private int donGia;
	private int soLuong;
	private int thanhTien;

	public Chitiethoadon() {
	}

	public Chitiethoadon(Hoadon hoadon, Menu menu, String tenGoi, int donGia, int soLuong, int thanhTien) {
		this.hoadon = hoadon;
		this.menu = menu;
		this.tenGoi = tenGoi;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MaCTHD", unique = true, nullable = false)
	public Integer getMaCthd() {
		return this.maCthd;
	}

	public void setMaCthd(Integer maCthd) {
		this.maCthd = maCthd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaHD", nullable = false)
	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMenu", nullable = false)
	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Column(name = "TenGoi", nullable = false, length = 10)
	public String getTenGoi() {
		return this.tenGoi;
	}

	public void setTenGoi(String tenGoi) {
		this.tenGoi = tenGoi;
	}

	@Column(name = "DonGia", nullable = false)
	public int getDonGia() {
		return this.donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	@Column(name = "SoLuong", nullable = false)
	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Column(name = "ThanhTien", nullable = false)
	public int getThanhTien() {
		return this.thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}

}
