/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.util.List;
import dao.studentDao;
import dao.studentDaoImp;
import model.Students;

/**
 *
 * @author User
 */
public class studentServiceImp implements studentService{
    private studentDao stuDao = null;
    public studentServiceImp() {
     stuDao = new studentDaoImp();    
    }
    @Override
    public List<Students> getList(){
     return stuDao.getList();
    }
}
