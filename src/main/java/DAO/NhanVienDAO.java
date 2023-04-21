/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Admin
 */
public class NhanVienDAO {
    private DB db;
    public NhanVienDAO(){
        
    }
    public List<NhanVien> takeAll() throws SQLException, ClassNotFoundException{
        
        Connection conn = db.connect();
        String sql = "select * from nhanvien where IsDeleted = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,0);
        ResultSet rs = pst.executeQuery();
        List<NhanVien> nvList = new ArrayList<>();
        while(rs.next()){
            nvList.add(new NhanVien(rs.getInt("MaNV"), rs.getString("TenNV"), rs.getString("SDT"),rs.getString("Email"), rs.getDate("NgaySinh"), rs.getString("TaiKhoan"),rs.getString("MatKhau"), rs.getInt("MaCV"), rs.getInt("IsDeleted")));
        }
        conn.close();
        return nvList;
    }
    
    public List<NhanVien> filter(String sortCondition,String searchInput) throws ClassNotFoundException, SQLException{
        String sql = "select * from nhanvien as nv join chucvu as cv on nv.MaCV = cv.MaCV "
                + "where cv.TenCV like ? and (nv.TenNV like ? or nv.Email like ? or nv.SDT like ?) and nv.IsDeleted = ? ";
        Connection conn = DB.connect();
        PreparedStatement pst =conn.prepareStatement(sql);
        pst.setString(1, sortCondition);
        pst.setString(2, searchInput);
        pst.setString(3, searchInput);
        pst.setString(4, searchInput);
        pst.setInt(5,0);
        ResultSet rs = pst.executeQuery();
        List<NhanVien> nvList = new ArrayList<>();
        while(rs.next()){
            nvList.add(new NhanVien(rs.getInt("MaNV"), rs.getString("TenNV"), rs.getString("SDT"),rs.getString("Email"), rs.getDate("NgaySinh"), rs.getString("TaiKhoan"),rs.getString("MatKhau"), rs.getInt("MaCV"), rs.getInt("IsDeleted")));
        }
        conn.close();
        return nvList;
    }
    
    public List<NhanVien> searchOnly(String searchInput) throws ClassNotFoundException, SQLException{
        Connection conn = DB.connect();
        String sql = "select * from nhanvien where (TenNV like ? or Email like ? or SDT like ?) and IsDeleted = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,searchInput);
        pst.setString(2,searchInput);
        pst.setString(3,searchInput);
        pst.setInt(4, 0);
        ResultSet rs = pst.executeQuery();
        List<NhanVien> nvList = new ArrayList<>();
        while(rs.next()){
            nvList.add(new NhanVien(rs.getInt("MaNV"), rs.getString("TenNV"), rs.getString("SDT"),rs.getString("Email"), rs.getDate("NgaySinh"), rs.getString("TaiKhoan"),rs.getString("MatKhau"), rs.getInt("MaCV"), rs.getInt("IsDeleted")));
        }
        conn.close();
        return nvList;
    }
    
    public int addEmp(NhanVien nv) throws ClassNotFoundException, SQLException{
        Connection con = DB.connect();
        String sql;
        if(nv.getMaCV() != -1)
            sql = "insert into nhanvien(TenNV,SDT,Email,NgaySinh,TaiKhoan,MatKhau,IsDeleted,MaCV) values(?,?,?,?,?,?,?,?)";
        else
            sql = "insert into nhanvien(TenNV,SDT,Email,NgaySinh,TaiKhoan,MatKhau,IsDeleted) values(?,?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, nv.getTenNV());
        pst.setString(2, nv.getSDT());
        pst.setString(3, nv.getEmail());
        
        pst.setString(4,  nv.getDate());
        pst.setString(5, nv.getTaiKhoan());
        pst.setString(6, nv.getMatKhau());
        
        pst.setInt(7, nv.getIsDeleted());
        if(nv.getMaCV() != -1){
            pst.setInt(8, nv.getMaCV());
        }
        int rs = pst.executeUpdate();
        con.close();
        return rs;
    }
    
    public int updateEmp(NhanVien nv) throws ClassNotFoundException, SQLException{
        Connection con = DB.connect();
        String sql;
        if(nv.getMaCV() != -1){
           sql = "update nhanvien set TenNV = ? ,SDT = ? , Email = ? , NgaySinh = ? , TaiKhoan = ? , MatKhau = ? ,MaCV = ? Where MaNV = ?";
        }
        else{
           sql = "update nhanvien set TenNV = ? ,SDT = ? , Email = ?, NgaySinh = ? ,TaiKhoan = ? ,MatKhau = ? Where MaNV = ?";
        }
        PreparedStatement pst = con.prepareStatement(sql);
         pst.setString(1, nv.getTenNV());
        pst.setString(2, nv.getSDT());
        pst.setString(3, nv.getEmail());
        
        pst.setString(4,  nv.getDate());
        pst.setString(5, nv.getTaiKhoan());
        pst.setString(6, nv.getMatKhau());
        if(nv.getMaCV() != -1){
            pst.setInt(7, nv.getMaCV());
            pst.setInt(8, nv.getMaNV());
        }
        else{
            pst.setInt(7, nv.getMaNV());
        }
        
        return pst.executeUpdate();
        
    }
    
    public int delEmp(int ID) throws ClassNotFoundException, SQLException{
        Connection con = DB.connect();
        String sql = "update nhanvien set IsDeleted = ? where MaNV = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, 1);
        pst.setInt(2, ID);
        return pst.executeUpdate();
    }
    
}