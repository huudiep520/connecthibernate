package entities;
// Generated Apr 5, 2016 10:07:51 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name = "menu", catalog = "quanlynhahang")
public class Menu implements java.io.Serializable {

	private String maMenu;
	private String tenGoi;
	private String hinh;
	private int gia;
	private float khuyenMai;
	private Set<Chitiethoadon> chitiethoadons = new HashSet<Chitiethoadon>(0);
	private Set<Chitietgoimenu> chitietgoimenus = new HashSet<Chitietgoimenu>(0);

	public Menu() {
	}

	public Menu(String maMenu, String tenGoi, String hinh, int gia, float khuyenMai) {
		this.maMenu = maMenu;
		this.tenGoi = tenGoi;
		this.hinh = hinh;
		this.gia = gia;
		this.khuyenMai = khuyenMai;
	}

	public Menu(String maMenu, String tenGoi, String hinh, int gia, float khuyenMai, Set<Chitiethoadon> chitiethoadons,
			Set<Chitietgoimenu> chitietgoimenus) {
		this.maMenu = maMenu;
		this.tenGoi = tenGoi;
		this.hinh = hinh;
		this.gia = gia;
		this.khuyenMai = khuyenMai;
		this.chitiethoadons = chitiethoadons;
		this.chitietgoimenus = chitietgoimenus;
	}

	@Id

	@Column(name = "MaMenu", unique = true, nullable = false, length = 10)
	public String getMaMenu() {
		return this.maMenu;
	}

	public void setMaMenu(String maMenu) {
		this.maMenu = maMenu;
	}

	@Column(name = "TenGoi", nullable = false)
	public String getTenGoi() {
		return this.tenGoi;
	}

	public void setTenGoi(String tenGoi) {
		this.tenGoi = tenGoi;
	}

	@Column(name = "Hinh", nullable = false, length = 50)
	public String getHinh() {
		return this.hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	@Column(name = "Gia", nullable = false)
	public int getGia() {
		return this.gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	@Column(name = "KhuyenMai", nullable = false, precision = 12, scale = 0)
	public float getKhuyenMai() {
		return this.khuyenMai;
	}

	public void setKhuyenMai(float khuyenMai) {
		this.khuyenMai = khuyenMai;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
	public Set<Chitiethoadon> getChitiethoadons() {
		return this.chitiethoadons;
	}

	public void setChitiethoadons(Set<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
	public Set<Chitietgoimenu> getChitietgoimenus() {
		return this.chitietgoimenus;
	}

	public void setChitietgoimenus(Set<Chitietgoimenu> chitietgoimenus) {
		this.chitietgoimenus = chitietgoimenus;
	}

}
