package entities;
// Generated Apr 5, 2016 10:07:51 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Nhanvientheoca generated by hbm2java
 */
@Entity
@Table(name = "nhanvientheoca", catalog = "quanlynhahang")
public class Nhanvientheoca implements java.io.Serializable {

	private String maNvtc;
	private Vitrinhanvien vitrinhanvien;
	private Integer soLuongToiThieu;
	private Integer soLuongToiDa;

	public Nhanvientheoca() {
	}

	public Nhanvientheoca(String maNvtc, Vitrinhanvien vitrinhanvien) {
		this.maNvtc = maNvtc;
		this.vitrinhanvien = vitrinhanvien;
	}

	public Nhanvientheoca(String maNvtc, Vitrinhanvien vitrinhanvien, Integer soLuongToiThieu, Integer soLuongToiDa) {
		this.maNvtc = maNvtc;
		this.vitrinhanvien = vitrinhanvien;
		this.soLuongToiThieu = soLuongToiThieu;
		this.soLuongToiDa = soLuongToiDa;
	}

	@Id

	@Column(name = "MaNVTC", unique = true, nullable = false, length = 10)
	public String getMaNvtc() {
		return this.maNvtc;
	}

	public void setMaNvtc(String maNvtc) {
		this.maNvtc = maNvtc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaViTri", nullable = false)
	public Vitrinhanvien getVitrinhanvien() {
		return this.vitrinhanvien;
	}

	public void setVitrinhanvien(Vitrinhanvien vitrinhanvien) {
		this.vitrinhanvien = vitrinhanvien;
	}

	@Column(name = "SoLuongToiThieu")
	public Integer getSoLuongToiThieu() {
		return this.soLuongToiThieu;
	}

	public void setSoLuongToiThieu(Integer soLuongToiThieu) {
		this.soLuongToiThieu = soLuongToiThieu;
	}

	@Column(name = "SoLuongToiDa")
	public Integer getSoLuongToiDa() {
		return this.soLuongToiDa;
	}

	public void setSoLuongToiDa(Integer soLuongToiDa) {
		this.soLuongToiDa = soLuongToiDa;
	}

}
