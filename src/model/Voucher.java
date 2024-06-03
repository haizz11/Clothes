/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author thaitv
 */
public class Voucher {
    
    private Integer id, idNhanVien, soLuong, giaTriToiThieu, giaTriToiDa;
    
    private String tenVoucher, trangThai;
    
    private Date ngayBatDau, ngayKetThuc, ngayTao, ngaySua;

    public Voucher() {
    }

    public Voucher(Integer id, Integer idNhanVien, Integer soLuong, Integer giaTriToiThieu, Integer giaTriToiDa, String tenVoucher, String trangThai, Date ngayBatDau, Date ngayKetThuc, Date ngayTao, Date ngaySua) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.soLuong = soLuong;
        this.giaTriToiThieu = giaTriToiThieu;
        this.giaTriToiDa = giaTriToiDa;
        this.tenVoucher = tenVoucher;
        this.trangThai = trangThai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getGiaTriToiThieu() {
        return giaTriToiThieu;
    }

    public void setGiaTriToiThieu(Integer giaTriToiThieu) {
        this.giaTriToiThieu = giaTriToiThieu;
    }

    public Integer getGiaTriToiDa() {
        return giaTriToiDa;
    }

    public void setGiaTriToiDa(Integer giaTriToiDa) {
        this.giaTriToiDa = giaTriToiDa;
    }

    public String getTenVoucher() {
        return tenVoucher;
    }

    public void setTenVoucher(String tenVoucher) {
        this.tenVoucher = tenVoucher;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }
    
    
    
}
