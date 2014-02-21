package com.DSA.BinerySearch;


class BSTNode
{
	//Attributes
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

}
