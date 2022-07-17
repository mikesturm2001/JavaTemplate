package TreesAndGraphs;


// Implement a function to check if a binary tree is balanced.
// balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more than one
public class CheckBalanced {

    /* recursive algorithm to find trees depth.
        Example
                    4                 Layer 1
                 /     \
               2         6            Layer 2
             /   \     /   \
            1     3   5     7         Layer 3
                                      Layer 4
        Call Stack
        1. root node 4, call for left and right
        2. node 2 and 6, call for left and right
        3. node 1, 3, 5 and 7. call for left and right
        4. all return -1
        5. Math.max(-1, -1) + 1 = 0 - Layer 4
        6. Math.max(0, 0) + 1 = 1   - Layer 3
        7. Math.max(1, 1) + 1 = 2   - Layer 2
        8. Math.max(2, 2) + 1 = 3   - Layer 1

        we get a value of 3 for the tree depth.
     */
    int getHeight(BinarySearchTree.Node root) {
        if(root == null) return -1; //base case
        return Math.max(getHeight(root.left), getHeight(root.right)) +1;
    }



    boolean isBalanced(BinarySearchTree.Node root) {
        if (root == null) return true; // base case

        // get the height of the left side of the tree and the height of the right side of the tree
        int heightDiff = getHeight(root.left) - getHeight(root.right);

        // Check to make sure that the height difference is less than or equal to 1.
        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            // traverse each layer as subtrees
            return  isBalanced(root.left) && isBalanced(root.right);
        }
    }
}