package com.DSA.BinerySearch;


class BST
{
	private BSTNode root;
    public BSTNode Tmproot;
    boolean availability;

    public BST()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }
    
	
	public void insert(int data,String name,String A_Name,String Sur,String Title)
    {
	
    }
	
	public boolean delete(int k)
    {
	if (isEmpty())
        {
            System.out.println("Tree Empty");
        	availability=false;
        }
		else if (search(k) == false)
            System.out.println("Sorry "+ k +" is not present");
        else
        {
            root = delete(root, k);
            System.out.println(k+ " deleted from the tree");
            availability=true;
        }
        
        return availability;
	
	}
	private BSTNode delete(BSTNode root, int k)
    {
	
	}
     
}
