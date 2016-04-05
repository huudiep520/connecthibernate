package entities;
// Generated Apr 5, 2016 10:07:51 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Nhanvien generated by hbm2java
 */
@Entity
@Table(name = "nhanvien", catalog = "quanlynhahang")
public class Nhanvien implements java.io.Serializable {

	private String maNhanVien;
	private Trinhdovitinh trinhdovitinh;
	private Vitrinhanvien vitrinhanvien;
	private String matKhau;
	private String cauHoiBaoMat;
	private String dapAnBaoMat;
	private String hoTen;
	private Date sinhNhat;
	private int sodt;
	private int cmnd;
	private Date ngayBatDau;
	private boolean trangPhuc;
	private int luongTheoCa;
	private boolean nghiViec;
	private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);
	private Set<Bangluong> bangluongs = new HashSet<Bangluong>(0);
	private Set<Banghe> banghes = new HashSet<Banghe>(0);
	private Set<Lichcalamviec> lichcalamviecs = new HashSet<Lichcalamviec>(0);

	public Nhanvien() {
	}

	public Nhanvien(String maNhanVien, Trinhdovitinh trinhdovitinh, Vitrinhanvien vitrinhanvien, String matKhau,
			String cauHoiBaoMat, String dapAnBaoMat, String hoTen, int sodt, int cmnd, Date ngayBatDau,
			boolean trangPhuc, int luongTheoCa, boolean nghiViec) {
		this.maNhanVien = maNhanVien;
		this.trinhdovitinh = trinhdovitinh;
		this.vitrinhanvien = vitrinhanvien;
		this.matKhau = matKhau;
		this.cauHoiBaoMat = cauHoiBaoMat;
		this.dapAnBaoMat = dapAnBaoMat;
		this.hoTen = hoTen;
		this.sodt = sodt;
		this.cmnd = cmnd;
		this.ngayBatDau = ngayBatDau;
		this.trangPhuc = trangPhuc;
		this.luongTheoCa = luongTheoCa;
		this.nghiViec = nghiViec;
	}

	public Nhanvien(String maNhanVien, Trinhdovitinh trinhdovitinh, Vitrinhanvien vitrinhanvien, String matKhau,
			String cauHoiBaoMat, String dapAnBaoMat, String hoTen, Date sinhNhat, int sodt, int cmnd, Date ngayBatDau,
			boolean trangPhuc, int luongTheoCa, boolean nghiViec, Set<Hoadon> hoadons, Set<Bangluong> bangluongs,
			Set<Banghe> banghes, Set<Lichcalamviec> lichcalamviecs) {
		this.maNhanVien = maNhanVien;
		this.trinhdovitinh = trinhdovitinh;
		this.vitrinhanvien = vitrinhanvien;
		this.matKhau = matKhau;
		this.cauHoiBaoMat = cauHoiBaoMat;
		this.dapAnBaoMat = dapAnBaoMat;
		this.hoTen = hoTen;
		this.sinhNhat = sinhNhat;
		this.sodt = sodt;
		this.cmnd = cmnd;
		this.ngayBatDau = ngayBatDau;
		this.trangPhuc = trangPhuc;
		this.luongTheoCa = luongTheoCa;
		this.nghiViec = nghiViec;
		this.hoadons = hoadons;
		this.bangluongs = bangluongs;
		this.banghes = banghes;
		this.lichcalamviecs = lichcalamviecs;
	}

	@Id

	@Column(name = "MaNhanVien", unique = true, nullable = false, length = 10)
	public String getMaNhanVien() {
		return this.maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaTDVT", nullable = false)
	public Trinhdovitinh getTrinhdovitinh() {
		return this.trinhdovitinh;
	}

	public void setTrinhdovitinh(Trinhdovitinh trinhdovitinh) {
		this.trinhdovitinh = trinhdovitinh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaViTri", nullable = false)
	public Vitrinhanvien getVitrinhanvien() {
		return this.vitrinhanvien;
	}

	public void setVitrinhanvien(Vitrinhanvien vitrinhanvien) {
		this.vitrinhanvien = vitrinhanvien;
	}

	@Column(name = "MatKhau", nullable = false, length = 16)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Column(name = "CauHoiBaoMat", nullable = false)
	public String getCauHoiBaoMat() {
		return this.cauHoiBaoMat;
	}

	public void setCauHoiBaoMat(String cauHoiBaoMat) {
		this.cauHoiBaoMat = cauHoiBaoMat;
	}

	@Column(name = "DapAnBaoMat", nullable = false)
	public String getDapAnBaoMat() {
		return this.dapAnBaoMat;
	}

	public void setDapAnBaoMat(String dapAnBaoMat) {
		this.dapAnBaoMat = dapAnBaoMat;
	}

	@Column(name = "HoTen", nullable = false)
	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SinhNhat", length = 10)
	public Date getSinhNhat() {
		return this.sinhNhat;
	}

	public void setSinhNhat(Date sinhNhat) {
		this.sinhNhat = sinhNhat;
	}

	@Column(name = "Sodt", nullable = false)
	public int getSodt() {
		return this.sodt;
	}

	public void setSodt(int sodt) {
		this.sodt = sodt;
	}

	@Column(name = "Cmnd", nullable = false)
	public int getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NgayBatDau", nullable = false, length = 10)
	public Date getNgayBatDau() {
		return this.ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	@Column(name = "TrangPhuc", nullable = false)
	public boolean isTrangPhuc() {
		return this.trangPhuc;
	}

	public void setTrangPhuc(boolean trangPhuc) {
		this.trangPhuc = trangPhuc;
	}

	@Column(name = "LuongTheoCa", nullable = false)
	public int getLuongTheoCa() {
		return this.luongTheoCa;
	}

	public void setLuongTheoCa(int luongTheoCa) {
		this.luongTheoCa = luongTheoCa;
	}

	@Column(name = "NghiViec", nullable = false)
	public boolean isNghiViec() {
		return this.nghiViec;
	}

	public void setNghiViec(boolean nghiViec) {
		this.nghiViec = nghiViec;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(Set<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Bangluong> getBangluongs() {
		return this.bangluongs;
	}

	public void setBangluongs(Set<Bangluong> bangluongs) {
		this.bangluongs = bangluongs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Banghe> getBanghes() {
		return this.banghes;
	}

	public void setBanghes(Set<Banghe> banghes) {
		this.banghes = banghes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Lichcalamviec> getLichcalamviecs() {
		return this.lichcalamviecs;
	}

	public void setLichcalamviecs(Set<Lichcalamviec> lichcalamviecs) {
		this.lichcalamviecs = lichcalamviecs;
	}

}
