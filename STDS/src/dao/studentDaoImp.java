/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.List;
import model.Students;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class studentDaoImp implements studentDao {
    
    @Override
    public List<Students> getList() {
        List<Students> list = new ArrayList<>();

        try {
            Connection conn = DBConnect.getConnection();
            String sql = "SELECT * FROM Students";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Students student = new Students();
                student.setStuID(rs.getString("Student ID"));
                student.setName(rs.getString("Name"));
                student.setGender(rs.getString("Gender"));
                student.setBirthday(rs.getString("Birthday"));
                student.setPhone(rs.getString("Phone"));
                student.setRoom(rs.getString("Room"));

                list.add(student);
            }

            rs.close();
            ps.close();
            conn.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
          return null;
    }
    public static void main(String[] args){
     studentDao stuDao = new studentDaoImp();
     System.out.println(stuDao);
    }
}

 