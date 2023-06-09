/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPham;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tam
 */
public class SanPhamBUS {
    private SanPhamDAO spDAO;
    public SanPhamBUS(){
        spDAO = new SanPhamDAO();
    }
    
    public List<SanPham> getAll () throws SQLException, ClassNotFoundException 
    {
        return spDAO.getAll();
    }
    
    public int themSanPham(SanPham sp) throws SQLException, ClassNotFoundException{
        return spDAO.themSanPham(sp);
    }
    
    public List<SanPham> searchProducts (String searchInput) throws SQLException, ClassNotFoundException {
        if(searchInput == null || searchInput.isEmpty()){
            searchInput = "%";
        }else{
            searchInput = "%" + searchInput + "%";
        }
        return spDAO.timKiemSanPham(searchInput);
    }
    public int xoaSanPham(int id) throws SQLException, ClassNotFoundException{
        return spDAO.xoaSanPham(id);
    }
    public int capNhatSanPham(SanPham sp) throws SQLException, ClassNotFoundException{
        return spDAO.capNhatSanPham(sp);
    }
}
