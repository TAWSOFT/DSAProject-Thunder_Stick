package com.DSA.BinerySearch;

import javax.swing.JFrame;


import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;


import java.awt.Font;
import java.awt.Color;


import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;

public class About extends JFrame {
	public About() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JLabel lblThunderstick = new JLabel("Thunderstick");
		lblThunderstick.setForeground(Color.YELLOW);
		lblThunderstick.setFont(new Font("Dialog", Font.BOLD, 14));
		lblThunderstick.setBounds(12, 0, 157, 45);
		getContentPane().add(lblThunderstick);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Our Vision", "To be a team which always", "come up with Innovative ", "& super quality software products "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBackground(Color.BLACK);
		list.setForeground(Color.MAGENTA);
		list.setToolTipText("");
		list.setBounds(35, 58, 276, 81);
		getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBackground(Color.BLACK);
		list_1.setForeground(Color.GREEN);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Our Mission", "Implementing a  Java based data base", "which can be used  in  libraries using  ", "our knowledge in Binary search Tree", "(BST) in data structures"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(118, 234, 276, 115);
		getContentPane().add(list_1);
		
		JList list_2 = new JList();
		list_2.setFont(new Font("Dialog", Font.BOLD, 12));
		list_2.setBackground(Color.BLACK);
		list_2.setForeground(Color.RED);
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mr.Thilina Anuradh Waasalage\t", "Ms.Kanishka kaushalya\t\t", "Ms.Thaveesha Danuri Gamage\t", "Ms Priyanka Premarathne\t\t"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setBounds(22, 445, 233, 81);
		getContentPane().add(list_2);
		
		JLabel lblGroupMembers = new JLabel("Group Members");
		lblGroupMembers.setBackground(Color.BLACK);
		lblGroupMembers.setForeground(Color.BLUE);
		lblGroupMembers.setBounds(57, 418, 118, 15);
		getContentPane().add(lblGroupMembers);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src/untitled.png"));
		lblNewLabel.setBounds(452, 12, 389, 262);
		getContentPane().add(lblNewLabel);
		
		JList list_3 = new JList();
		list_3.setBackground(Color.BLACK);
		list_3.setForeground(Color.ORANGE);
		list_3.setModel(new AbstractListModel() {
			String[] values = new String[] {"13208317", "13208330", "13208204", "13208197"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_3.setBounds(254, 445, 85, 68);
		getContentPane().add(list_3);
		
		JButton btnOpenTheApplication = new JButton("Open the Application");
		btnOpenTheApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				GUI guiFrame = new GUI();
				
			}
		});
		btnOpenTheApplication.setBounds(518, 470, 200, 67);
		getContentPane().add(btnOpenTheApplication);
		
		this.setSize(800,600);
		this.setVisible(true);
	}
}
