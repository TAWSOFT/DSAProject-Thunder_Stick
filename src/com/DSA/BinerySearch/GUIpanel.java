package com.DSA.BinerySearch;

import javax.swing.JPanel;

public class GUIpanel extends JPanel {

	String[] columnNames = { "ISBN No", "Book Name", "Book Type",
			"Author Name", "Author Surname" };

	private JTextField txtISBNNo;
	private JTextField txtName;
	JButton btnAdd;
	JButton btnSearch;

	BST bst;
	BSTNode Bnode, root;
	private JTextField txtCount;
	private JTextField txtISBNNoSearch;
	private JTextField txtAname;
	private JTextField txtSname;
	private JTextField txtTitle;

	String SortStucture;
	ButtonGroup group;
	JRadioButton rdbtnInOrder;
	JRadioButton rdbtnPreOrder;
	JRadioButton rdbtnPostOrder;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblAbout;

	public GUIpanel() {

		bst = new BST();
		Bnode = new BSTNode();
		root = new BSTNode();
		setPanel();
	}

	private void setPanel() {

		group = new ButtonGroup();

		setRadio();

		setForeground(Color.GREEN);
		setBackground(UIManager.getColor("window"));

		btnAdd = new JButton("Add");
		btnAdd.setBounds(30, 198, 61, 25);
		btnAdd.setBackground(UIManager.getColor("Separator.foreground"));
		btnAdd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					
					if(validateTextboxes()){
						System.out.println("Validation not Success");
						JOptionPane.showMessageDialog(null,
								"Item Not Added");
					}
					else{
					
						if (bst.insert(Integer.parseInt(txtISBNNo.getText()),
								txtName.getText(), txtAname.getText(),
								txtSname.getText(), txtTitle.getText())) {
							JOptionPane.showMessageDialog(null,
									"Item Not Added Item Exists");
						} else {
							JOptionPane.showMessageDialog(null,
									"Item Added Successfully");
							System.out.println("Item Added");
						}
						
				}
				}
				
					

				 catch (Exception ex) {
					 System.out.println("Error");
						JOptionPane.showMessageDialog(null,
								"Item Not Added check ISBN");

				}

			}
		});

		
		setbtnDesigns();

		btnSearch = new JButton("Search");
		btnSearch.setBounds(313, 229, 117, 25);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					if(bst.search(Integer.parseInt(txtISBNNoSearch.getText()))){
						Bnode = null;
						Bnode = bst.getName(Integer.parseInt(txtISBNNoSearch.getText()));

						String name = Bnode.getName();
						String A_Name = Bnode.Author_Name();
						String S_Name = Bnode.Author_Surname();
						String BType = Bnode.BType();

						System.out.println(name);
						txtName.setText(name);
						txtISBNNo.setText(txtISBNNoSearch.getText());
						txtAname.setText(A_Name);
						txtSname.setText(S_Name);
						txtTitle.setText(BType);
					}
					else{System.out.println("No Item Found");}
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "No Item Found");
					System.out.println("No Item Found");

				}

			}
		});

		JButton btnCount = new JButton("Count");
		btnCount.setBounds(390, 76, 86, 25);
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCount.setText("" + bst.countNodes());

			}
		});

		setLables();

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBounds(436, 229, 117, 25);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					if (bst.delete(Integer.parseInt(txtISBNNoSearch.getText()))) {
						System.out.println("Item Deleted");
						JOptionPane.showMessageDialog(null, "Item Deleted");
					} else {
						JOptionPane.showMessageDialog(null, "Item Not Deleted");
					}

				} catch (Exception ex) {
				}
			}
		});

		JLabel lblWellcomeTo = new JLabel(
				"(: Wellcome to Our Binary Search Tree :)");
		lblWellcomeTo.setBounds(166, 12, 327, 15);
		lblWellcomeTo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblWellcomeTo.setBackground(Color.MAGENTA);
		lblWellcomeTo.setForeground(new Color(255, 0, 0));

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(257, 350, 116, 47);
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

		designSpace();

		JButton btnSearchAll = new JButton("Search All");
		btnSearchAll.setBounds(30, 361, 117, 25);
		btnSearchAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (group.getSelection().getActionCommand() == "InOrder") {
					SortStucture = "InOrder";
				} else if (group.getSelection().getActionCommand() == "PreOrder") {
					SortStucture = "PreOrder";
				} else {
					SortStucture = "PostOrder";
				}

				System.out.println(SortStucture);

				root = bst.getRoot();
				DisplayTree ab = new DisplayTree();

				ab.setBST(root, SortStucture);

			}
		});
		setLayout(null);
		add(lblWellcomeTo);
		add(lblNewLabel);
		add(txtISBNNo);
		add(lblNewLabel_1);
		add(txtName);
		add(btnCount);
		add(txtCount);
		add(lblNewLabel_4);
		add(txtTitle);
		add(lblNewLabel_2);
		add(txtAname);
		add(lblNewLabel_3);
		add(txtSname);
		add(btnAdd);
		add(txtISBNNoSearch);
		add(btnSearch);
		add(btnNewButton);
		add(rdbtnInOrder);
		add(rdbtnPreOrder);
		add(rdbtnPostOrder);
		add(btnSearchAll);
		add(btnClear);
		
		JLabel lblNewLabel_5 = new JLabel("ISBN");
		lblNewLabel_5.setBounds(369, 201, 61, 19);
		add(lblNewLabel_5);


	}

	private void setLables() {
		txtCount = new JTextField();
		txtCount.setBounds(483, 79, 48, 19);
		txtCount.setColumns(10);

		txtISBNNoSearch = new JTextField();
		txtISBNNoSearch.setBounds(439, 201, 114, 19);
		txtISBNNoSearch.setColumns(10);

	}

	private void setRadio() {
		rdbtnInOrder = new JRadioButton("In Order");
		rdbtnInOrder.setBounds(30, 268, 149, 23);
		rdbtnInOrder.setSelected(true);
		rdbtnInOrder.setBackground(UIManager.getColor("window"));
		rdbtnInOrder.setActionCommand("InOrder");

		rdbtnPreOrder = new JRadioButton("Pre Order");
		rdbtnPreOrder.setBounds(30, 295, 149, 23);
		rdbtnPreOrder.setBackground(UIManager.getColor("window"));
		rdbtnPreOrder.setActionCommand("PreOrder");

		rdbtnPostOrder = new JRadioButton("Post Order");
		rdbtnPostOrder.setBounds(30, 322, 149, 23);
		rdbtnPostOrder.setBackground(UIManager.getColor("window"));
		rdbtnPostOrder.setActionCommand("PostOrder");

		group.add(rdbtnInOrder);
		group.add(rdbtnPostOrder);
		group.add(rdbtnPreOrder);

	}

	private void designSpace() {
		lblNewLabel_2 = new JLabel("Author Name");
		lblNewLabel_2.setBounds(12, 125, 116, 15);

		txtAname = new JTextField();
		txtAname.setBounds(130, 125, 114, 19);
		txtAname.setColumns(10);

		lblNewLabel_3 = new JLabel("Author Surname");
		lblNewLabel_3.setBounds(12, 152, 116, 15);

		txtSname = new JTextField();
		txtSname.setBounds(130, 152, 114, 19);
		txtSname.setColumns(10);

		lblNewLabel_4 = new JLabel("Book Type");
		lblNewLabel_4.setBounds(12, 103, 116, 15);

		txtTitle = new JTextField();
		txtTitle.setBounds(130, 101, 114, 19);
		txtTitle.setColumns(10);

	}

	private void setbtnDesigns() {

		lblNewLabel = new JLabel("ISBN No");
		lblNewLabel.setBounds(12, 49, 116, 15);

		lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setBounds(12, 76, 116, 15);

		txtISBNNo = new JTextField();
		txtISBNNo.setToolTipText("");
		txtISBNNo.setBounds(130, 49, 114, 19);
		txtISBNNo.setColumns(10);

		txtName = new JTextField();
		txtName.setBounds(130, 76, 114, 19);
		txtName.setColumns(10);

	}
	
	public boolean validateTextboxes(){
		
		boolean error=false;
		
		if(txtAname.getText().isEmpty()){error=true;}
		if(txtISBNNo.getText().isEmpty()){error=true;}
		if(txtName.getText().isEmpty()){error=true;}
		if(txtSname.getText().isEmpty()){error=true;}
		if(txtTitle.getText().isEmpty()){error=true;}

		return error;

	}
	
	
	
}
