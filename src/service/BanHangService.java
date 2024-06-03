/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Voucher;
import java.sql.*;
import model.HoaDon;
import repository.DBContext;

/**
 *
 * @author thaitv
 */
public class BanHangService {
    
    private Connection conn = DBContext.getConnection();
    
    public ArrayList<Voucher> loadCbo(){
        String sql = "SELECT * FROM Voucher";
        ArrayList<Voucher> listVoucher = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                int id = rs.getInt("Id");
                String ten = rs.getString("TenVoucher");
                int idNV = rs.getInt("IdNhanVien");
                int soLuong = rs.getInt("SoLuong");
                
                Voucher voucher = new Voucher(id, idNV, soLuong, soLuong, id, ten, ten, null, null, null, null);
                listVoucher.add(voucher);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listVoucher;
    }
    
    public ArrayList<HoaDon> listHoaDon(){
        String sql = "SELECT * FROM HoaDon";
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        try {
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {  
                HoaDon hoaDon = new HoaDon();
                hoaDon.setId(rs.getInt("Id"));
                hoaDon.setNgayTao(rs.getDate("NgayTao"));
                hoaDon.setIdNV(rs.getInt("IdNhanVien"));
                hoaDon.setTrangThai(rs.getString("TrangThai"));
                
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }
    
    public void createHoaDon(HoaDon hd){
        String sql = "INSERT INTO HoaDon (Id, IdNhanVien, NgayTao, TrangThai) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, hd.getId());
            ps.setObject(2, hd.getIdNV());
            ps.setObject(3, hd.getNgayTao());
            ps.setObject(4, hd.getTrangThai());
            ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
