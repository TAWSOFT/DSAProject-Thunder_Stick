package com.DSA.BinerySearch;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.UIManager;
import javax.xml.ws.handler.MessageContext;

import java.awt.Font;
import java.awt.SystemColor;



public class GUIpanel extends JPanel {

	String[] columnNames = {"ISBN No","Book Name","Book Type","Author Name","Author Surname"};
	
	
	private JTextField txtISBNNo;
	private JTextField txtName;
	JButton btnAdd;
	JButton btnSearch;
	

	private JTextField txtCount;
	private JTextField txtISBNNoSearch;
	private JTextField txtAname;
	private JTextField txtSname;
	private JTextField txtTitle;
	
	public GUIpanel() {
		

		setPanel();
	}
	
	private void setPanel(){
	
	
		
		setForeground(Color.GREEN);
		setBackground(new Color(173, 255, 47));
		setLayout(null);
		
		btnAdd = new JButton("Add");
		btnAdd.setBackground(UIManager.getColor("Separator.foreground"));
		btnAdd.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				

				
			}
		});
		
		setbtnDesigns();
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnSearch.setBounds(313, 229, 117, 25);
		add(btnSearch);
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtCount.setText(""+bst.countNodes());
				
			}
		});
		btnCount.setBounds(390, 76, 86, 25);
		add(btnCount);
		
		txtCount = new JTextField();
		txtCount.setBounds(483, 79, 48, 19);
		add(txtCount);
		txtCount.setColumns(10);
		
		JLabel lblIsbnNo = new JLabel("ISBN No");
		lblIsbnNo.setBounds(313, 200, 70, 15);
		add(lblIsbnNo);
		
		txtISBNNoSearch = new JTextField();
		txtISBNNoSearch.setBounds(379, 198, 114, 19);
		add(txtISBNNoSearch);
		txtISBNNoSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnNewButton.setBounds(436, 229, 117, 25);
		add(btnNewButton);
		
		JLabel lblWellcomeTo = new JLabel("(: Wellcome to Our Binary Search Tree :)");
		lblWellcomeTo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblWellcomeTo.setBackground(Color.MAGENTA);
		lblWellcomeTo.setForeground(new Color(255, 0, 0));
		lblWellcomeTo.setBounds(85, 12, 327, 15);
		add(lblWellcomeTo);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				txtCount.setText("");
				txtISBNNo.setText("");
				txtISBNNoSearch.setText("");
				txtName.setText("");
				txtAname.setText("");
				txtSname.setText("");
				txtTitle.setText("");
				
			}
		});
		btnClear.setBackground(UIManager.getColor("activeCaptionBorder"));
		btnClear.setBounds(238, 318, 116, 47);
		add(btnClear);
		
		
		
		designSpace();
		
		JButton btnSearchAll = new JButton("Search All");
		btnSearchAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				
			}
		});
		btnSearchAll.setBounds(30, 262, 117, 25);
		add(btnSearchAll);
		
	}
	
	
	
	
	
	private void designSpace() {
		JLabel lblNewLabel_2 = new JLabel("Author Name");
		lblNewLabel_2.setBounds(12, 125, 116, 15);
		add(lblNewLabel_2);
		
		txtAname = new JTextField();
		txtAname.setBounds(130, 125, 114, 19);
		add(txtAname);
		txtAname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Author Surname");
		lblNewLabel_3.setBounds(12, 152, 116, 15);
		add(lblNewLabel_3);
		
		txtSname = new JTextField();
		txtSname.setBounds(130, 152, 114, 19);
		add(txtSname);
		txtSname.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Book Type");
		lblNewLabel_4.setBounds(12, 103, 116, 15);
		add(lblNewLabel_4);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(130, 101, 114, 19);
		add(txtTitle);
		txtTitle.setColumns(10);
		
	}

	private void setbtnDesigns(){
		btnAdd.setBounds(30, 198, 61, 25);
		add(btnAdd);
		
		JLabel lblNewLabel = new JLabel("ISBN No");
		lblNewLabel.setBounds(12, 49, 116, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setBounds(12, 76, 116, 15);
		add(lblNewLabel_1);
		
		txtISBNNo = new JTextField();
		txtISBNNo.setBounds(130, 49, 114, 19);
		add(txtISBNNo);
		txtISBNNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(130, 76, 114, 19);
		add(txtName);
		txtName.setColumns(10);
		
		
	}
}
