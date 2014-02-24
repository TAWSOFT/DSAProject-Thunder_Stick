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
	public void setBST(BSTNode b,String stucture)
	{
		root=b;

		model = new DefaultTableModel(); 
        JTable table = new JTable(model); 

        // Create a couple of columns 
        model.addColumn("ISBN No"); 
        model.addColumn("Book Name"); 
        model.addColumn("Book Type"); 
        model.addColumn("Author Name"); 
        model.addColumn("Author Surname"); 

		if(stucture=="InOrder")
        {
        	if(root==null){System.out.println("Null tree");}
	        else
	        {
			
			}
		}


	}
        private void PostOrder(BSTNode r) {
        }
