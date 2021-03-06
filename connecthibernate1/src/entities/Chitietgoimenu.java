package entities;
// Generated Apr 5, 2016 10:07:51 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Chitietgoimenu generated by hbm2java
 */
@Entity
@Table(name = "chitietgoimenu", catalog = "quanlynhahang")
public class Chitietgoimenu implements java.io.Serializable {

	private Integer maCtg;
	private Banghe banghe;
	private Menu menu;
	private Trangthai trangthai;
	private String tenGoi;
	private int soLuongGoi;
	private String ghiChu;
	private Date thoiGianGoi;

	public Chitietgoimenu() {
	}

	public Chitietgoimenu(Banghe banghe, Menu menu, Trangthai trangthai, String tenGoi, int soLuongGoi, String ghiChu,
			Date thoiGianGoi) {
		this.banghe = banghe;
		this.menu = menu;
		this.trangthai = trangthai;
		this.tenGoi = tenGoi;
		this.soLuongGoi = soLuongGoi;
		this.ghiChu = ghiChu;
		this.thoiGianGoi = thoiGianGoi;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MaCTG", unique = true, nullable = false)
	public Integer getMaCtg() {
		return this.maCtg;
	}

	public void setMaCtg(Integer maCtg) {
		this.maCtg = maCtg;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaBan", nullable = false)
	public Banghe getBanghe() {
		return this.banghe;
	}

	public void setBanghe(Banghe banghe) {
		this.banghe = banghe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMenu", nullable = false)
	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaTrangThai", nullable = false)
	public Trangthai getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(Trangthai trangthai) {
		this.trangthai = trangthai;
	}

	@Column(name = "TenGoi", nullable = false)
	public String getTenGoi() {
		return this.tenGoi;
	}

	public void setTenGoi(String tenGoi) {
		this.tenGoi = tenGoi;
	}

	@Column(name = "SoLuongGoi", nullable = false)
	public int getSoLuongGoi() {
		return this.soLuongGoi;
	}

	public void setSoLuongGoi(int soLuongGoi) {
		this.soLuongGoi = soLuongGoi;
	}

	@Column(name = "GhiChu", nullable = false)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "ThoiGianGoi", nullable = false, length = 8)
	public Date getThoiGianGoi() {
		return this.thoiGianGoi;
	}

	public void setThoiGianGoi(Date thoiGianGoi) {
		this.thoiGianGoi = thoiGianGoi;
	}

}
