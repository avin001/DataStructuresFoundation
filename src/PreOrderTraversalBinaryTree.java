
public class PreOrderTraversalBinaryTree {
	
	public static void preOrderTraversal(BTNode root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preOrderTraversal(root.leftNode);
		preOrderTraversal(root.rightNode);
	}

	public static void main(String[] args) {
		BTNode root = new BTNode(10);
		root.leftNode = new BTNode(5);
		root.rightNode = new BTNode(20);
		
		root.leftNode.leftNode = new BTNode(3);
		root.leftNode.rightNode = new BTNode(8);
		
		root.rightNode.leftNode = new BTNode(15);
		root.rightNode.rightNode = new BTNode(30);
		preOrderTraversal(root);
	}

}
