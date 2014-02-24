package com.DSA.BinerySearch;

class BSTNode
{
    BSTNode left, right;
    int ISBN;
    String Name;
    String BType;
    String Author_Name;
    String Author_Surname;


    public BSTNode()
    {
        left = null;
        right = null;
        ISBN= 0;
        Name="";
        BType="";
        Author_Name="";
        Author_Surname="";
    }

    public BSTNode(int INo,String na,String n3,String n4,String n5)
    {
        left = null;
        right = null;
        ISBN = INo;
        Name=na;
        BType=n5;
        Author_Name=n3;
        Author_Surname=n4;
    }

    public void setLeft(BSTNode n)
    {
        left = n;
    }

    public void setRight(BSTNode n)
    {
        right = n;
    }

    public BSTNode getLeft()
    {
        return left;
    }

    public BSTNode getRight()
    {
        return right;
    }

    public void setData(int d,String n2,String n3,String n4,String n5)
    {
    	ISBN = d;
        Name=n2;
        Author_Name=n3;
        Author_Surname=n4;
        BType=n5;
    }
   
    public int getData()
    {
        return ISBN;
    }  
    public String getName()
    {
        return Name;
    }  
    public String Author_Name()
    {
        return Author_Name;
    }
    public String Author_Surname()
    {
        return Author_Surname;
    }
    
    public String BType()
    {
        return BType;
    }
}