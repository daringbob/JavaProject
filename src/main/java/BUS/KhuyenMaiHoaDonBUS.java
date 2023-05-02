/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhuyenMaiHoaDonDAO;
import DTO.KhuyenMaiHoaDon;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KhuyenMaiHoaDonBUS {
    private KhuyenMaiHoaDonDAO kmhdDAO=new KhuyenMaiHoaDonDAO();
    
    public ArrayList<KhuyenMaiHoaDon> getKmhdNotDeleted() throws SQLException, ClassNotFoundException
    {
        ArrayList<KhuyenMaiHoaDon> arr=kmhdDAO.getAllKmhd();
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getIsDeleted()==1)
            {
                arr.remove(i);
            }
        }
        return arr;
    }
    
    public boolean deleteKmhd(int id) throws SQLException, ClassNotFoundException
    {
        return kmhdDAO.deleteKmhd(id);
    }
    
    public boolean updateKmhd(KhuyenMaiHoaDon kmhd) throws SQLException, ClassNotFoundException
    {
        return kmhdDAO.updateKmhd(kmhd);
    }
    
    public boolean addKmhd(KhuyenMaiHoaDon kmhd) throws SQLException, ClassNotFoundException
    {
        return kmhdDAO.addKmhd(kmhd);
    }
    
    public ArrayList<KhuyenMaiHoaDon> searchKmhd(String dk, String input,int dk1) throws ClassNotFoundException, SQLException
    {
        ArrayList<String> temp=new ArrayList<String>();
        temp.add("Mã KMHD");
        temp.add("Tên KM");
        temp.add("Ngày bắt đầu");
        temp.add("Ngày kết thúc");
        temp.add("Đơn hàng tối thiểu");
        temp.add("Phần trăm giảm");
        temp.add("Số tiền giảm");
        temp.add("Tổng lượt áp dụng");
        temp.add("Tổng lượt đã dùng");
        ArrayList<String> temp1=new ArrayList<String>();
        temp1.add("MaKMHD");
        temp1.add("TenKM");
        temp1.add("NgayBatDau");
        temp1.add("NgayKetThuc");
        temp1.add("DonHangToiThieu");
        temp1.add("PhanTramGiam");
        temp1.add("SoTienGiam");
        temp1.add("TongLuotApDung");
        temp1.add("TongLuotDaDung");
        for(int i=0;i<temp.size();i++)
        {
            if(temp.get(i)==dk)
            {
                return kmhdDAO.searchKmhd(temp1.get(i), input, dk1);
            }
        }
        return kmhdDAO.searchKmhd(temp1.get(0), input, dk1);
    }
}
