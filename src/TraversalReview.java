public class TraversalReview {

    /**
     * Returns three times the sum of the values in the tree.
     * 
     * If node is null returns 0.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * Result: 3*(-9+2+7+4+-6+1+5+-3+8+33+77) = 357
     * 
     * @param node the root of the tree
     * @return three times the sum of the nodes in the tree
     */
    public static int tripleSum(TreeNode node) {
        if (node == null) return 0;
        int sum = 0;

        if (node.left != null && node.right != null){
            sum = (node.data) * 3;
        }

         return node.data * 3 + tripleSum(node.left) + tripleSum(node.right);

    
         // solution 2:
        //  if (node == null) return 0;
        //  return (node.data * 3) + tripleSum(node.left) + tripleSum(node.right);

    }

    /**
     * Returns the sum of all positive values in the tree.
     * 
     * If the node is null or the tree contains only negative values, returns 0.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * 
     * Result: 2+7+4+1+5+8+33+77 = 137
     * 
     * @param node the root of the tree
     * @return the sum of the positive values in the tree
     */
    public static int positiveSum(TreeNode node) {
        if (node == null) return 0;
        int sum = 0;
        if (node.data > 0){
            sum = node.data;
        }

        sum += positiveSum(node.left);
        sum += positiveSum(node.right);

        return sum;
    }

    /**
     * Returns the maximum even value in the tree.
     * 
     * If node is null or there are no even values in the tree, returns Integer.MIN_VALUE.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * Result: 8
     * 
     * @param node
     * @return
     */
    public static int evenMax(TreeNode node) {
        
        int min = Integer.MIN_VALUE;
        if (node == null) return min;
        
        // Set currentEvenMax as Integer.MIN_VALUE and if statement to find even nodes
        int currentEvenMax = min;
        if (node.data % 2 == 0){
            currentEvenMax = node.data;
        }

        // Check left and right nodes for even
        int leftEvenMax = evenMax(node.left);
        int rightEvenMax = evenMax(node.right);

        // Return even max after comparing
        return Math.max(currentEvenMax, Math.max(leftEvenMax, rightEvenMax));

        // Solution 2
        // if (node == null) return Integer.MIN_VALUE;
        // return Math.max((Math.max(leftEvenMax, rightEvenMax)), node.data % 2 == 0 ? node.data : Integer.MIN_VALUE);

    }

    /**
     * Returns whether all children of every node in a binary tree has a value
     * strictly greater (not equal) than their parent.
     * 
     * If a node has no children or the node is null, returns true.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * Result: false (some of the child nodes have lower values than their parents
     *                For example, 1 < 2).
     * 
     * @param node the root of the tree
     * @return whether all child nodes have strictly greater values than the parents
     */
    public static boolean isIncreasing(TreeNode node) {
        if (node == null) return true;

        // Check if nodes of left and right are not null and smaller than their parients -> return false
        if (node.left != null && (node.left.data <= node.data)){
            return false;
        }
        if (node.right != null && (node.right.data <= node.data)){
            return false;
        }

        return isIncreasing(node.left) && isIncreasing(node.right);
    } 

    /**
     * Returns whether every node in the tree has either 0 or 2 children.
     * 
     * If node is null returns true.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * Result: false (some nodes have only one child. For example, the 4 node)
     * 
     * @param node the root of the tree
     * @return whether every node has 0 or 2 children
     */
    public static boolean noSingleChildren(TreeNode node) {
        if (node == null) return true;

        // return false if only has 1 child
        if ((node.left == null && node.right != null) || (node.left != null && node.right == null)){
            return false;
        }
        return noSingleChildren(node.left) && noSingleChildren(node.right);
    }

    /**
     * Returns whether at least one of the values in the tree is zero.
     * 
     * If node is null, returns false.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * Result: true (there is at least one zero in the tree)
     * 
     * @param node the root of the tree
     * @return whether there is it least one zero value in the tree.
     */
    public static boolean hasZero(TreeNode node) {
        if (node == null) return false;

        // Return true if there is one zero value in the tree
        if (node.data == 0){
            return true; 
        }

        // return either of left or right node has at least 1 zero value
        return hasZero(node.left) || hasZero(node.right);

        // Solution 2:
        //return node != null && (node.data == 0 || hasZero(node.left) || hasZero(node.right));
    }

    /**
     * Returns whether there exists at least one value in the tree that is not divisible by k.
     * 
     * If node is null, returns false.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * Example k: 3
     * Result: true (some nodes in the tree have values not divisible by 3. For example, 5)
     * 
     * @param node the root of the tree
     * @param k the value to check for divisibility by
     * @return whether every value is divisible by k
     */
    public static boolean hasNonDivisible(TreeNode node, int k) {
        if (node == null) return false;

        // Return true if node value isn't divisible by k
        if (node.data % k != 0){
            return true;
        }

        // Return left or right node that has at least one node isn't divisible by k
        return hasNonDivisible(node.left, k) || hasNonDivisible(node.right, k);
    }

    /**
     * Returns a String of the concatenated values of the tree traversed in-order.
     * 
     * If the node is null, returns an empty String.
     * 
     * Example:
     * 
     *             -9
     *             / \
     *            2   5
     *           / \   \
     *          7   1  -3
     *         /       / \
     *        4       8  33
     *         \        /  \
     *         -6      0    77
     * 
     * Result: "4-6721-958-303377"
     * 
     * @param node the root of the tree
     * @return a string with all the values of the tree concatenated in-order
     */
    public static String concatenate(TreeNode node) {
        if (node == null) return "";

        // Initiate the root
        String root = String.valueOf(node.data);

        // Get left and right nodes
        String leftNode = concatenate(node.left);
        String rightNode = concatenate(node.right);

        // Return all value of the in-order
        return leftNode + root + rightNode;
    }
}