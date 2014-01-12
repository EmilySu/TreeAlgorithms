	public static void inorderTraversalRec (TreeNode root) {  
		if(root==null) return ; 
		inorderTraversalRec(root.left); 
		System.out.println(root.val);
		inorderTraversalRec(root.right); 
	} 


	public static void preorderTraversalRec(TreeNode root) {  
		
		if(root==null) return ; 
		System.out.println(root.val);
		preorderTraversalRec(root.left); 
		preorderTraversalRec(root.right); 	
		
	}  

	public static void postorderTraversalRec(TreeNode root) {  
		if(root==null) return ; 
		postorderTraversalRec(root.left); 
		postorderTraversalRec(root.right);
		System.out.print(root.val+" "); 

	}  

