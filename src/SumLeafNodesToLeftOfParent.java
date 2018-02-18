
class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class SumLeafNodesToLeftOfParent {
	
	public static int sumOfLeafNodesToLeft(BinaryTreeNode<Integer> root, boolean isLeft) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return isLeft ? root.data : 0;
		return sumOfLeafNodesToLeft(root.left, true) + sumOfLeafNodesToLeft(root.right, false);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(6);
		root.left = new BinaryTreeNode<>(8);
		root.right = new BinaryTreeNode<>(4);
		root.left.left = new BinaryTreeNode<>(1);
		root.left.right = new BinaryTreeNode<>(9);
		root.right.left = new BinaryTreeNode<>(5);
		root.right.right = new BinaryTreeNode<>(3);
		System.out.println(sumOfLeafNodesToLeft(root, false));
	}

}
