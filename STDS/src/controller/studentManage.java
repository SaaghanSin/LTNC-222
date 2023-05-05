/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.DBConnect;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import service.studentService;
import service.studentServiceImp;
import java.util.List;
import model.Students;
import ubility.tableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.RowFilter;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import view.StudentsPanel;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class studentManage {
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    
    private studentService stuService = null;
    
    private String[] listColumn = {"Student ID","Name","Gender","Birthday","Phone","Room"};
    
    private TableRowSorter<TableModel> rowSorter = null;

    public studentManage(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        
        this.stuService = new studentServiceImp();
        
    }
    public void setDataToModel(){
     List<Students> listItem = stuService.getList();
     
     DefaultTableModel model = new tableModel().setTableStudent(listItem, listColumn);
     
     JTable table = new JTable(model);
     rowSorter = new TableRowSorter<>(table.getModel());
     table.setRowSorter(rowSorter);
     
     jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        String text = jtfSearch.getText();
        if(text.trim().length()==0){
        rowSorter.setRowFilter(null);}
        else{
        rowSorter.setRowFilter(RowFilter.regexFilter("?i"+text));}
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        String text = jtfSearch.getText();
        if(text.trim().length()==0){
        rowSorter.setRowFilter(null);}
        else{
        rowSorter.setRowFilter(RowFilter.regexFilter("?i"+text));}
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Called when the attributes of an element in the document have changed
    }
});
    table.getTableHeader().setFont(new Font("Century Gothic",Font.BOLD,18));
    table.getTableHeader().setPreferredSize(new Dimension(100,50));
    table.setRowHeight(50);
    table.validate();
    table.repaint();
    
    table.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseClicked(MouseEvent e){
         if(e.getClickCount()==2 && table.getSelectedRow()!=-1){
          DefaultTableModel model = (DefaultTableModel) table.getModel();
          int selectedRowIndex = table.getSelectedRow();
          selectedRowIndex = table.convertColumnIndexToModel(selectedRowIndex);
          
          Students student = new Students();
          student.setStuID (model.getValueAt(selectedRowIndex, 0).toString());
          student.setName(model.getValueAt(selectedRowIndex,1).toString());
          student.setGender(model.getValueAt(selectedRowIndex,2).toString());
          student.setBirthday(model.getValueAt(selectedRowIndex,3).toString());
          student.setPhone(model.getValueAt(selectedRowIndex,4).toString());
          student.setRoom(model.getValueAt(selectedRowIndex,5).toString());
          
          StudentsPanel frame = new StudentsPanel(student);
          frame.setVisible(true);
          

         }
     }   
    });
     
    
    	
	
    
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().add(table);
    scrollPane.setPreferredSize(new Dimension(1300,400));
    
    jpnView.removeAll();
    jpnView.setLayout(new BorderLayout());
    jpnView.add(scrollPane);
    jpnView.validate();
    jpnView.repaint();
    }
   
   
    
}
