package com.DSA.BinerySearch;



class BST
{
    private BSTNode root;
    public BSTNode Tmproot;
    boolean availability;
    
	boolean checkISBN;

    public BST()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }
    
    public BSTNode getRoot()
    {
    	return root;
    }

    public boolean insert(int data,String name,String A_Name,String Sur,String Title)
    {
		checkISBN=false;
        root = insert(root, data,name,A_Name,Sur,Title);
		return checkISBN;
    }

    private BSTNode insert(BSTNode node, int data,String name,String A_Name,String A_Sur,String Title)
    {
        if (node == null)
            node = new BSTNode(data,name,A_Name,A_Sur,Title);
        else
        {
            if (data < node.getData())
                node.left = insert(node.left,data,name,A_Name,A_Sur,Title);
            else if(data > node.getData())
                node.right = insert(node.right,data,name,A_Name,A_Sur,Title);
			else{
            	System.out.println("You can't add a Book with the existing ISBN no");
            	checkISBN=true;
			}
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
        
        else if (search(k) == false){
            System.out.println("Sorry "+ k +" is not present");
            availability=false;
        }
        
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

    public int countNodes()
    {
        return countNodes(root);
    }

    private int countNodes(BSTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public boolean search(int val)
    {
        return search(root, val);
    }

    private boolean search(BSTNode node, int ISBN)
    {
        boolean found = false;
        while ((node != null) && !found)
        {
            int rtnval = node.getData();
            if (ISBN < rtnval)
            	node = node.getLeft();
            else if (ISBN > rtnval)
            	node = node.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(node, ISBN);
        }
        return found;
    }
 
    public BSTNode getName(int isbn){
    	try{
    	
    	if(Tmproot==null){Tmproot=root;}
    	if(root==null){return null;}
    	else
    	{
    		if(isbn==Tmproot.getData())
    		{
    			return Tmproot;
    			
    		}
    		else if(Tmproot.getData() < isbn)
    		{
    			Tmproot=Tmproot.getRight();
    			
    		}
    		else if (Tmproot.getData() > isbn){
    			Tmproot=Tmproot.getLeft();
			}
    		getName(isbn);
    		
    	}
    	}
    	catch(Exception ex){}
    	return Tmproot;
    }
    
    public BSTNode getNameSearchByName(String name) {
	try {

			if (Tmproot == null) {
				Tmproot = root;
			}
			String name1 = Tmproot.getName().toString();
			if (root == null) {
				return null;
			} else {
				if (name.contentEquals(name1)) {
					return Tmproot;
				} else if (Tmproot.getLeft() == null) {
					Tmproot = Tmproot.getRight();
				} else if (Tmproot.getLeft() != null) {
					Tmproot = Tmproot.getLeft();
				}
				getNameSearchByName(name);

			}
		} catch (Exception ex) {
		}
		return Tmproot;
	}

    
   // Delete By name
   public boolean deleteByName(String  name) {
		if (isEmpty()) {
			System.out.println("Tree Empty");
			availability = false;
		}

		
	}
   
}
