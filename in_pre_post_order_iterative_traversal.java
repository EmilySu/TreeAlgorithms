	public static void preorderTraversal(TreeNode root) {  

		Stack<TreeNode> s = new Stack<TreeNode>(); 
		s.add(root); 

		while(!s.isEmpty()){
			TreeNode node = s.pop();
			System.out.println(node.val); 
			if(node.right!=null) s.add(node.right); 
			if(node.left!=null) s.add(node.left); 
		}
	} 

public static void inorderTraversal(TreeNode root){  
		if(root==null) return; 

		Stack<TreeNode> s = new Stack<TreeNode>(); 

		TreeNode cur = root; 

		while(true){
			while(cur!=null){
				s.push(cur); 
				cur = cur.left; 
			}
			if(s.isEmpty()) {
				break; 
			}
			cur = s.pop(); 
			System.out.println(cur.val+" ");
			cur = cur.right; 
		}

	}


	public static void postorderTraversal(TreeNode root) { 

		Stack<TreeNode> s = new Stack<TreeNode>(); 
		Stack<TreeNode> output = new Stack<TreeNode>(); 
		
		s.add(root); 
		
		while(!s.isEmpty()){
			TreeNode cur = s.pop(); 	
			output.push(cur); 
			
			if(cur.left!=null) s.push(cur.left); 
			if(cur.right!=null) s.push(cur.right); 

		}
		
		while(!output.isEmpty()){
			System.out.println(output.pop().val+" "); 
		}
		
		
	}  

