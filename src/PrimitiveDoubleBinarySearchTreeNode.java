// PROGRAMMER: COREY TAYLOR
public class PrimitiveDoubleBinarySearchTreeNode {

	// INSTANCE VARIABLES
	private double element;
	private PrimitiveDoubleBinarySearchTreeNode leftChild;
	private PrimitiveDoubleBinarySearchTreeNode rightChild;

	// CONSTRUCTORS
	public PrimitiveDoubleBinarySearchTreeNode(double element) {
		this.element = element;
		this.leftChild = null;
		this.rightChild = null;
	}

	// INSTANCE METHODS
	public double getElement() {
		return element;
	}

	public PrimitiveDoubleBinarySearchTreeNode getLeftChild() {
		return leftChild;
	}

	public PrimitiveDoubleBinarySearchTreeNode getRightChild() {
		return rightChild;
	}

	public void setLeftChild(PrimitiveDoubleBinarySearchTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(PrimitiveDoubleBinarySearchTreeNode rightChild) {
		this.rightChild = rightChild;
	}
}
