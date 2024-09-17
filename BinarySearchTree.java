public class BinarySearchTree
{
	private TreeNode root;
   private int count = 0;
   private int numNodes = 0;
   
	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null){
			tree = new TreeNode(val);
         return tree;
      } else{
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		
		if(dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
      }
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}
   
   public void preOrder(){
      preOrder(root);
      System.out.println("\n\n");
   }  
   
   public void preOrder(TreeNode tree){
      if(tree != null){
         System.out.print(tree.getValue() + " ");
         preOrder(tree.getLeft());
         preOrder(tree.getRight());
      }
   }
   
   public void postOrder(){
      postOrder(root);
      System.out.println("\n\n");
   } 
   
   private void postOrder(TreeNode tree){
      if(tree != null){
         postOrder(tree.getLeft());
         postOrder(tree.getRight());
         System.out.print(tree.getValue() + " ");
      }
   }
   
   public void revOrder(){
      revOrder(root);
      System.out.println("\n\n");
   }
   
   private void revOrder(TreeNode tree){
      if(tree != null){
         revOrder(tree.getRight());
         System.out.print(tree.getValue() + " ");
         revOrder(tree.getLeft());
      }
   }

	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}
   
   public int getNumLeaves(){
      count = 0;
      return getNumLeaves(root);
   }
   
   private int getNumLeaves(TreeNode tree){
      
      if(tree.getLeft() == null && tree.getRight() == null){
         count++;
      } else {
         getNumLeaves(tree.getLeft());
         getNumLeaves(tree.getRight());
      }
      return count;
   }

   public int getHeight(){
      int layers = 0;
      TreeNode node = root;
      while(node.getLeft() != null){
         node = node.getLeft();
         layers++;
      }
      return layers;
   }
   
   public int getWidth(){
      int width = 1;
      TreeNode node = root;
      while(node.getLeft() != null){
         node = node.getLeft();
         width++;
      }
      node = root;
      while(node.getRight() != null){
         node = node.getRight();
         width++;
      }
      return width;
   }
   
   public int getNumNodes()
	{
      numNodes = 0;
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode tree)
	{
		if (tree != null){
			getNumNodes(tree.getLeft());
			numNodes++;
			getNumNodes(tree.getRight());
		}
      return numNodes;
	}
   
   public boolean isFull(){
      if(getNumNodes() == ((int)Math.pow(2, getHeight() + 1)) - 1){
         return true;
      } else {
         return false;
      }
   }
   
   public Comparable minNode(){
      TreeNode t = root;
      while(t.getLeft() != null){
         t = t.getLeft();
      }
      return t.getValue();
   }
	
   public Comparable maxNode(){
      TreeNode t = root;
      while(t.getRight() != null){
         t = t.getRight();
      }
      return t.getValue();
   }
	//add options
	//search
	//level order
	//display like a tree
	//remove
   
	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		return "";
	}
}