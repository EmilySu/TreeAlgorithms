	private static int getMatch(TreeNode root, TreeNode p, TreeNode q){
		if(root==null) return 0; 
		int matches = getMatch(root.left, p, q)+getMatch(root.right, p, q); 
		if(root==p || root==q) return 1+matches; 
		else return matches; 
	}
	
	private static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
		if(root==null||p==null||q==null) return null; 
		if(root==p||root==q) return root; 
		int matches = getMatch(root.left, p, q); 
		if(matches == 1) return root; 
		else if (matches == 2) return LCA(root.left, p, q);
		else return LCA(root.right, p, q); 
	}