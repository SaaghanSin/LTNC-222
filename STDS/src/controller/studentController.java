/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JButton;
import javax.swing.JTextField;
import model.Students;

/**
 *
 * @author User
 */
public class studentController {
    private JButton btnAdd;
    private JTextField jtf1;
    private JTextField jtf2;
    private JTextField jtf3;
    private JTextField jtf4;
    private JTextField jtf5;
    private JTextField jtf6;

    public studentController(JButton btnAdd, JTextField jtf1, JTextField jtf2, JTextField jtf3, JTextField jtf4, JTextField jtf5, JTextField jtf6) {
        this.btnAdd = btnAdd;
        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
        this.jtf3 = jtf3;
        this.jtf4 = jtf4;
        this.jtf5 = jtf5;
        this.jtf6 = jtf6;
    }
    public void setView(Students student){
     jtf1.setText(student.getStuID());
     jtf2.setText(student.getName());
     jtf3.setText(student.getGender());
     jtf4.setText(student.getBirthday());
     jtf5.setText(student.getPhone());
     jtf6.setText(student.getRoom());
     System.out.println("Success");
    }
}

