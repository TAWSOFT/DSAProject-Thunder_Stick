package com.DSA.BinerySearch;

import javax.swing.JFrame;


public class GUI extends JFrame {
	
	private GUIpanel currentPanel;
	
	public GUI() {
		
		currentPanel=new GUIpanel();
		this.setContentPane(currentPanel);
		this.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
		this.setTitle("Binary Search Tree GUI");
		this.setSize(600,500);
		this.setVisible(true);
		

	}

}
