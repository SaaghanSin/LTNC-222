/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ubility;
import javax.swing.table.DefaultTableModel;
import model.Students;
import java.util.List;
/**
 *
 * @author User
 */
public class tableModel {
    public DefaultTableModel setTableStudent(List<Students> listItem, String[] listColumn){
     DefaultTableModel dtm = new DefaultTableModel(){
      @Override
    
      public boolean isCellEditable(int row, int column){
     return false;
    }
    };
    dtm.setColumnIdentifiers(listColumn);
    int columns = listColumn.length;
    Object[] obj = null;
    int rows = listItem.size();
    if(rows>0){
        for(int i = 0 ; i < rows; i++){
         Students student = listItem.get(i);
         obj = new Object[columns];
         obj[0]= student.getStuID();
         obj[1]= student.getName();
         obj[2]= student.getGender();
         obj[3]= student.getBirthday();
         obj[4]= student.getPhone();
         obj[5]= student.getRoom();
         dtm.addRow(obj);
        }
    }
    return dtm;
    }
    
}
