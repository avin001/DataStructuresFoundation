
public class IsBST {
	
	public static boolean isBinaryTreeBST(BTNode root, int lowerBound, int upperBound) {
		if (root == null)
			return true;
		if (root.data < lowerBound || root.data > upperBound)
			return false;
		return isBinaryTreeBST(root.leftNode, lowerBound, root.data) && 
				isBinaryTreeBST(root.rightNode, root.data, upperBound);
	}

	public static void main(String[] args) {
		BTNode root = new BTNode(10);
		root.leftNode = new BTNode(5);
		root.rightNode = new BTNode(20);
		
		root.leftNode.leftNode = new BTNode(3);
		root.leftNode.rightNode = new BTNode(8);
		
		root.rightNode.leftNode = new BTNode(15);
		root.rightNode.rightNode = new BTNode(30);
		System.out.println(isBinaryTreeBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

}
