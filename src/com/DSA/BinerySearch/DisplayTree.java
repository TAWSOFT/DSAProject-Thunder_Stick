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
		else if(stucture=="PreOrder")
        {
        	if(root==null){System.out.println("Null tree");}
	        else
	        {

			}
		}
		else
        {
	        if(root==null){System.out.println("Null tree");}
	        else
	        {

			}
		}

	}
        private void PostOrder(BSTNode r) {
        	 if (r != null)
        {
            PostOrder(r.getLeft());             
            PostOrder(r.getRight());
            model.addRow(new Object[]{r.ISBN, r.Name,r.BType,r.Author_Name,r.Author_Surname});  
            System.out.println("ISBN is:"+r.ISBN+", Book Name is:"+r.Name+", Author Name is"+r.Author_Name+", Book Type is:"+r.BType+", Author Surname          is:"+r.Author_Surname+"");
            
        }
        
    }
        }
