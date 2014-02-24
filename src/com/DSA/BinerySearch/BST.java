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
	root = insert(root, data,name,A_Name,Sur,Title);
    }
     private BSTNode insert(BSTNode node, int data,String name,String A_Name,String A_Sur,String Title)
     {
     	if (node == null)
            node = new BSTNode(data,name,A_Name,A_Sur,Title);
             else
        {
            if (data <= node.getData())
                node.left = insert(node.left,data,name,A_Name,A_Sur,Title);
            else
                node.right = insert(node.right,data,name,A_Name,A_Sur,Title);
        }
         return node;
    
     	
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
	BSTNode p, p2, n;
        if (root.getData() == k)
        {
            BSTNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null)
            {
                p = rt;
                return p;
            }
            else if (rt == null)
            {
                p = lt;
                return p;
            }
            else
            {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData())
        {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        }
        else
        {
            n = delete(root.getRight(), k);
            root.setRight(n);             
        }
        return root;
	
	}
	
	 private boolean search(BSTNode r, int val)
     {
		boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
			if (val < rval)
                r = r.getLeft();
				else if (val > rval)
                r = r.getRight();
			else
            {
                found = true;
                break;
            }
		found = search(r, val);
        }
		return found;
    }
}
