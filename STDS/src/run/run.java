/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

/**
 *
 * @author User
 */


import view.login;

public class run{
	public static void main(String[] args) {
		try {
			login obj = new login();
	                obj.setVisible(true);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

