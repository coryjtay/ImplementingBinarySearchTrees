// PROGRAMMER: COREY TAYLOR
public class PrimitiveDoubleBinarySearchTree {

	// INSTANCE VARIABLES
	private int size;
	private PrimitiveDoubleBinarySearchTreeNode root;

	// CONSTRUCTORS
	public PrimitiveDoubleBinarySearchTree() {
		size = 0;
		root = null;
	}

	public PrimitiveDoubleBinarySearchTree(double rootElement) {
		size = 1;
		root = new PrimitiveDoubleBinarySearchTreeNode(rootElement);
	}

	public PrimitiveDoubleBinarySearchTree(double[] array) {
		size = 0;
		for (double element : array) {
			insert(element);
		}
	}

	// INSTANCE METHODS
	public boolean insert(double element) {
		PrimitiveDoubleBinarySearchTreeNode newNode = new PrimitiveDoubleBinarySearchTreeNode(element);
		if (size == 0) {
			root = newNode;
		} else {
			PrimitiveDoubleBinarySearchTreeNode parent = getParent(element);
			if (parent == null) {
				return false;
			} else if (parent.getElement() > element) {
				parent.setLeftChild(newNode);
			} else {
				parent.setRightChild(newNode);
			}
		}
		size++;
		return true;
	}

	public int getSize() {
		return size;
	}

	public boolean search(double searchElement) {
		PrimitiveDoubleBinarySearchTreeNode current = root;
		while (current != null) {
			if (searchElement == current.getElement()) {
				return true;
			} else if (searchElement > current.getElement()) {
				current = current.getRightChild();
			} else {
				current = current.getLeftChild();
			}
		}
		return false;
	}

	public PrimitiveDoubleBinarySearchTreeNode getParent(double element) {
		PrimitiveDoubleBinarySearchTreeNode parent = root;
		PrimitiveDoubleBinarySearchTreeNode current = root;
		while (current != null) {
			if (element == current.getElement()) {
				return null;
			} else if (element < current.getElement()) {
				parent = current;
				current = current.getLeftChild();
			} else {
				parent = current;
				current = current.getRightChild();
			}
		}
		return parent;
	}

}
