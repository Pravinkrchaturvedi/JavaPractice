package com.ds.tree;

/**
 * @author pravin class Tree . It has only one field: a Node variable that holds
 *         the root. It doesn’t need fields for the other nodes because they are
 *         all accessed from the root
 * 
 */
public class BinaryTree {

	private Node root;

	/**
	 * @param node
	 */
	public void insertNode(Node node) {

	}

	/**
	 * @param key
	 * @param data
	 * We use a new variable, parent (the parent of current ), to remember the last non- null
     * node we encountered
	 */
	public void insertWithData(int key, double data) {
		Node insertnode = new Node();
		insertnode.key = key;
		insertnode.data = data;

		if (root == null) {

			root = insertnode;
		} else {
			Node currentRoot = root;
			Node parent;
			while (true) {
				parent = currentRoot;
				if (currentRoot.key < key) {
					currentRoot = currentRoot.right;
					if (currentRoot == null) {
						System.out.println("Not Found Node Containing Data :"
								+ key);
						parent.right = insertnode;
						return;
					}
				} else {
					currentRoot = currentRoot.left;
					if (currentRoot == null) {
						System.out.println("Not Found Node Containing Data :"
								+ key);
						parent.left = insertnode;
						return;

					}
				}

			}

		}

	}

	/**
	 * @param key
	 */
	public void deleteNode(int key) {
       Node nodeToDelete = searchNode( key);
       if(nodeToDelete == null){
    	   System.out.println("nothing to delete");
       }
       
	}

	/**
	 * @param key
	 */
	public Node searchNode(int key) {
		Node currentRoot = root;
		while (currentRoot.key != key) {
			if (currentRoot.key < key)
				currentRoot = currentRoot.right;
			else
				currentRoot = currentRoot.left;
			if (currentRoot == null) {
				System.out.println("Not Found Node Containing Data :" + key);
				return null;
			}
		}
		return currentRoot;

	}

	/**
	 * @param key
	 * @return
	 */
	public int findHeight(int key) {

		return 0;
	}

}
