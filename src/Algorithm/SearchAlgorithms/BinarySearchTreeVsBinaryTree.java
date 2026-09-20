package Algorithm.SearchAlgorithms;

/*
* A Binary Tree is a tree data structure in which each node has at most two children which are referred to as the left child and the
* right child
* A Binary Search Tree sometimes called a ordered or sorted binary tree =, are a particular type of container, data structure that
* stores items in memory. They allow fast lookup, addition and removal of items, and can be used to implement dynamic sets of items
* or lookup tables that allow finding items by its keys.
*
* Binary search tree keeps the keys in a sorted order, so that lookup and other operations can use the principle of binary search
* when looking for a key in tree they traverse the tree from the root to the leaf making comparisons to keys stored in the nodes of
* the tree and deciding, on the basis of this comparison they continue searching in the left and the right subtrees. On average
* this means that each comparison allows the operations to skip about half the tree, so that each lookup insertion and deletion
* takes times proportional to the logarithm of the number of items stored in the  tree. This is much better than the linear time
* required to find items by key in and (unordered) array , but slower than the corresponding operations on hash table.
* */

public class BinarySearchTreeVsBinaryTree {

    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTreeVsBinaryTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTreeVsBinaryTree tree = new BinarySearchTreeVsBinaryTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}

