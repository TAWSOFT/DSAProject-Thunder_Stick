package com.DSA.BinerySearch;



import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayTree extends JFrame {
	private DefaultTableModel model;
	private BSTNode root;
	
	public DisplayTree()
	{
		
		this.setDefaultCloseOperation(GUI.HIDE_ON_CLOSE);
		this.setLocation(700, 150);
		this.setTitle("Outputs");
		this.setSize(550,150);
		this.setVisible(true);
	}



}
