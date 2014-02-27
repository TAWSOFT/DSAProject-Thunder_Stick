package com.DSA.BinerySearch;

public class MainClass {

	public static void main(String[] args) {
	
		GUI guiFrame = new GUI();
		
		//TreeDiagram Tree=new TreeDiagram();
        
		BST bst = new BST(); 
		
		
		
        System.out.println("Binary Search Tree Test\n");
        
        /*
   
        do    
        {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty"); 
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                bst.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to delete");
                bst.delete( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bst.search( scan.nextInt() ));
                break;                                          
            case 4 : 
                System.out.println("Nodes = "+ bst.countNodes());
                break;     
            case 5 :  
                System.out.println("Empty status = "+ bst.isEmpty());
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
 
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y'); 
        */
        /*
        
        bst.insert(1,"hi","","");
        bst.insert(4,"hello");
        bst.insert(2,"fine");
        bst.insert(3,"Thanks");
	
        System.out.println("Search result 	  :"+ bst.search(2));
        System.out.println("No nodes available:"+bst.countNodes());
        System.out.println("ISBN No:"+bst.getName(4));
        */
        
        
     //   bst.delete(k);
	}

}
