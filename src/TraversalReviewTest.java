import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TraversalReviewTest {

    //
    // Tests for tripleSum(TreeNode)
    //

    /**
     * Tree:
     *   null (empty tree)
     */
    @Test
    public void testTripleSum_null() {
        assertEquals(0, TraversalReview.tripleSum(null));
    }

    /**
     * Tree:
     *     8
     */
    @Test
    public void testTripleSum_singleNode() {
        TreeNode root = new TreeNode(8);
        // 3 * 8 = 24
        assertEquals(24, TraversalReview.tripleSum(root));
    }

    /**
     * Tree:
     *         5
     *        / \
     *       3   7
     *      / \
     *     2   4
     *
     * All positive values (three levels)
     */
    @Test
    public void testTripleSum_allPositive() {
        TreeNode root = new TreeNode(5,
            new TreeNode(3,
                new TreeNode(2),
                new TreeNode(4)
            ),
            new TreeNode(7)
        );
        // Sum = 5 + 3 + 2 + 4 + 7 = 21, triple = 63
        assertEquals(63, TraversalReview.tripleSum(root));
    }

    /**
     * Tree:
     *          -2
     *          / \
     *        -6  -4
     *       /      \
     *     -8       -10
     *
     * All negative values (three levels)
     */
    @Test
    public void testTripleSum_allNegative() {
        TreeNode root = new TreeNode(-2,
            new TreeNode(-6,
                new TreeNode(-8),
                null
            ),
            new TreeNode(-4, null,
                new TreeNode(-10)
            )
        );
        // Sum = -2 + -6 + -8 + -4 + -10 = -30, triple = -90
        assertEquals(-90, TraversalReview.tripleSum(root));
    }

    /**
     * Tree:
     *             10
     *            /  \
     *          -5    6
     *         / \     \
     *        3   0     -2
     *             \
     *              7
     *
     * Mixed positive, negative, and zero (four levels)
     */
    @Test
    public void testTripleSum_mixedValues() {
        TreeNode root = new TreeNode(10,
            new TreeNode(-5,
                new TreeNode(3),
                new TreeNode(0, null,
                    new TreeNode(7)
                )
            ),
            new TreeNode(6, null,
                new TreeNode(-2)
            )
        );
        // Sum = 10 + (-5) + 3 + 0 + 7 + 6 + (-2) = 19, triple = 57
        assertEquals(57, TraversalReview.tripleSum(root));
    }

    /**
     * Javadoc Example Tree:
     * 
     *              -9
     *             /   \
     *            2     5
     *           / \     \
     *          7   1    -3
     *         /         / \
     *        4         8  33
     *         \        /   \
     *         -6     0    77
     * 
     * Result: 3 * (-9 + 2 + 7 + 4 + (-6) + 1 + 5 + (-3) + 8 + 33 + 77) = 357
     */
    @Test
    public void testTripleSum_javadocExample() {
        TreeNode root = new TreeNode(-9,
            new TreeNode(2,
                new TreeNode(7,
                    new TreeNode(4, null,
                        new TreeNode(-6)
                    ),
                    null
                ),
                new TreeNode(1)
            ),
            new TreeNode(5, null,
                new TreeNode(-3,
                    new TreeNode(8),
                    new TreeNode(33,
                        new TreeNode(0),
                        new TreeNode(77)
                    )
                )
            )
        );
        assertEquals(357, TraversalReview.tripleSum(root));
    }


    // //
    // // Tests for positiveSum(TreeNode)
    // //

    // /**
    //  * Tree:
    //  *   null (empty tree)
    //  */
    // @Test
    // public void testPositiveSum_null() {
    //     assertEquals(0, TraversalReview.positiveSum(null));
    // }

    // /**
    //  * Tree:
    //  *          -7
    //  *         /  \
    //  *       -3   -1
    //  *       / \
    //  *     -8  -2
    //  *
    //  * All negative values (extended to three levels)
    //  */
    // @Test
    // public void testPositiveSum_allNegative() {
    //     TreeNode root = new TreeNode(-7,
    //         new TreeNode(-3,
    //             new TreeNode(-8),
    //             new TreeNode(-2)
    //         ),
    //         new TreeNode(-1)
    //     );
    //     assertEquals(0, TraversalReview.positiveSum(root));
    // }

    // /**
    //  * Tree:
    //  *         9
    //  *        / \
    //  *       4   2
    //  *      /     \
    //  *     6       3
    //  *
    //  * All positive values (extended to three levels)
    //  */
    // @Test
    // public void testPositiveSum_allPositive() {
    //     TreeNode root = new TreeNode(9,
    //         new TreeNode(4, new TreeNode(6), null),
    //         new TreeNode(2, null, new TreeNode(3))
    //     );
    //     // Sum = 9 + 4 + 6 + 2 + 3 = 24
    //     assertEquals(24, TraversalReview.positiveSum(root));
    // }

    // /**
    //  * Tree:
    //  *            8
    //  *           / \
    //  *         -3   5
    //  *         /     \
    //  *       -6       0
    //  *
    //  * Mixed positive, negative, zero (three levels)
    //  */
    // @Test
    // public void testPositiveSum_mixedValues() {
    //     TreeNode root = new TreeNode(8,
    //         new TreeNode(-3,
    //             new TreeNode(-6),
    //             null
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(0)
    //         )
    //     );
    //     // Sum of positives = 8 + 5 = 13 (zero does not contribute)
    //     assertEquals(13, TraversalReview.positiveSum(root));
    // }

    // /**
    //  * Tree:
    //  *   6
    //  *    \
    //  *     -2
    //  *      \
    //  *       3
    //  *
    //  * Mixed: positive, negative (three levels)
    //  */
    // @Test
    // public void testPositiveSum_chain() {
    //     TreeNode root = new TreeNode(6, null,
    //         new TreeNode(-2, null,
    //             new TreeNode(3)
    //         )
    //     );
    //     // Sum of positives = 6 + 3 = 9
    //     assertEquals(9, TraversalReview.positiveSum(root));
    // }

    // /**
    //  * Javadoc Example Tree:
    //  * 
    //  *              -9
    //  *             /   \
    //  *            2     5
    //  *           / \     \
    //  *          7   1    -3
    //  *         /         / \
    //  *        4         8  33
    //  *         \        /   \
    //  *         -6     0    77
    //  * 
    //  * Sum of positive values: 2 + 7 + 4 + 1 + 5 + 8 + 33 + 77 = 137
    //  */
    // @Test
    // public void testPositiveSum_javadocExample() {
    //     TreeNode root = new TreeNode(-9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null,
    //                     new TreeNode(-6)
    //                 ),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(-3,
    //                 new TreeNode(8),
    //                 new TreeNode(33,
    //                     new TreeNode(0),
    //                     new TreeNode(77)
    //                 )
    //             )
    //         )
    //     );
    //     assertEquals(137, TraversalReview.positiveSum(root));
    // }


    // //
    // // Tests for evenMax(TreeNode)
    // //

    // /**
    //  * Tree:
    //  *   null (empty tree)
    //  */
    // @Test
    // public void testEvenMax_null() {
    //     assertEquals(Integer.MIN_VALUE, TraversalReview.evenMax(null));
    // }

    // /**
    //  * Tree:
    //  *     5
    //  *
    //  * Single odd node (one level)
    //  */
    // @Test
    // public void testEvenMax_singleOdd() {
    //     TreeNode root = new TreeNode(5);
    //     assertEquals(Integer.MIN_VALUE, TraversalReview.evenMax(root));
    // }

    // /**
    //  * Tree:
    //  *     8
    //  *
    //  * Single even node (one level)
    //  */
    // @Test
    // public void testEvenMax_singleEven() {
    //     TreeNode root = new TreeNode(8);
    //     assertEquals(8, TraversalReview.evenMax(root));
    // }

    // /**
    //  * Tree:
    //  *         10
    //  *        /  \
    //  *       3    14
    //  *            / \
    //  *          -2   7
    //  *
    //  * Mixed even and odd (three levels)
    //  */
    // @Test
    // public void testEvenMax_mixedValues() {
    //     TreeNode root = new TreeNode(10,
    //         new TreeNode(3),
    //         new TreeNode(14,
    //             new TreeNode(-2),
    //             new TreeNode(7)
    //         )
    //     );
    //     // Even values: 10, 14, -2 → max = 14
    //     assertEquals(14, TraversalReview.evenMax(root));
    // }

    // /**
    //  * Tree:
    //  *         -8
    //  *         / \
    //  *       -4  -12
    //  *       /
    //  *     -16
    //  *
    //  * All even negative (three levels)
    //  */
    // @Test
    // public void testEvenMax_allEvenNegative() {
    //     TreeNode root = new TreeNode(-8,
    //         new TreeNode(-4,
    //             new TreeNode(-16),
    //             null
    //         ),
    //         new TreeNode(-12)
    //     );
    //     // Even values: -8, -4, -16, -12 → max = -4
    //     assertEquals(-4, TraversalReview.evenMax(root));
    // }

    // /**
    //  * Tree:
    //  *         9
    //  *        / \
    //  *       7   5
    //  *      /     \
    //  *     3       1
    //  *
    //  * No even values at all (extended to three levels)
    //  */
    // @Test
    // public void testEvenMax_noEvenValues() {
    //     TreeNode root = new TreeNode(9,
    //         new TreeNode(7, new TreeNode(3), null),
    //         new TreeNode(5, null, new TreeNode(1))
    //     );
    //     assertEquals(Integer.MIN_VALUE, TraversalReview.evenMax(root));
    // }

    // /**
    //  * Javadoc Example Tree:
    //  * 
    //  *              -9
    //  *             /   \
    //  *            2     5
    //  *           / \     \
    //  *          7   1    -3
    //  *         /         / \
    //  *        4         8  33
    //  *         \        /   \
    //  *         -6     0    77
    //  * 
    //  * Maximum even value: 8
    //  */
    // @Test
    // public void testEvenMax_javadocExample() {
    //     TreeNode root = new TreeNode(-9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null,
    //                     new TreeNode(-6)
    //                 ),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(-3,
    //                 new TreeNode(8),
    //                 new TreeNode(33,
    //                     new TreeNode(0),
    //                     new TreeNode(77)
    //                 )
    //             )
    //         )
    //     );
    //     assertEquals(8, TraversalReview.evenMax(root));
    // }


    // //
    // // Tests for isIncreasing(TreeNode)
    // //

    // /**
    //  * Tree:
    //  *   null (empty tree)
    //  */
    // @Test
    // public void testIsIncreasing_null() {
    //     assertTrue(TraversalReview.isIncreasing(null));
    // }

    // /**
    //  * Tree:
    //  *     12
    //  *
    //  * Single node (one level)
    //  */
    // @Test
    // public void testIsIncreasing_singleNode() {
    //     TreeNode root = new TreeNode(12);
    //     assertTrue(TraversalReview.isIncreasing(root));
    // }

    // /**
    //  * Tree:
    //  *         5
    //  *        / \
    //  *       7   8
    //  *            \
    //  *             10
    //  *
    //  * Every child > parent (three levels)
    //  */
    // @Test
    // public void testIsIncreasing_trueCase() {
    //     TreeNode root = new TreeNode(5,
    //         new TreeNode(7),
    //         new TreeNode(8, null,
    //             new TreeNode(10)
    //         )
    //     );
    //     assertTrue(TraversalReview.isIncreasing(root));
    // }

    // /**
    //  * Tree:
    //  *         5
    //  *        / \
    //  *       3   8
    //  *      /     \
    //  *     2       9
    //  *
    //  * Left child (3) < parent (5) → false (extended to three levels)
    //  */
    // @Test
    // public void testIsIncreasing_falseDirectChild() {
    //     TreeNode root = new TreeNode(5,
    //         new TreeNode(3, new TreeNode(2), null),
    //         new TreeNode(8, null,
    //             new TreeNode(9)
    //         )
    //     );
    //     assertFalse(TraversalReview.isIncreasing(root));
    // }

    // /**
    //  * Tree:
    //  *         4
    //  *        / \
    //  *       5   6
    //  *      /     \
    //  *     3       7
    //  *
    //  * Node 3 < parent 5 → false (three levels)
    //  */
    // @Test
    // public void testIsIncreasing_falseDeepChild() {
    //     TreeNode root = new TreeNode(4,
    //         new TreeNode(5,
    //             new TreeNode(3),
    //             null
    //         ),
    //         new TreeNode(6, null,
    //             new TreeNode(7)
    //         )
    //     );
    //     assertFalse(TraversalReview.isIncreasing(root));
    // }

    // /**
    //  * Tree:
    //  *         5
    //  *        / \
    //  *       5   6
    //  *      /
    //  *     7
    //  *
    //  * Left child equals parent → not strictly greater → false (extended to three levels)
    //  */
    // @Test
    // public void testIsIncreasing_equalValues() {
    //     TreeNode root = new TreeNode(5,
    //         new TreeNode(5, new TreeNode(7), null),
    //         new TreeNode(6)
    //     );
    //     assertFalse(TraversalReview.isIncreasing(root));
    // }

    // /**
    //  * Javadoc Example Tree:
    //  * 
    //  *              -9
    //  *             /   \
    //  *            2     5
    //  *           / \     \
    //  *          7   1    -3
    //  *         /         / \
    //  *        4         8  33
    //  *         \        /   \
    //  *         -6     0    77
    //  * 
    //  * Result: false (1 < 2, for example)
    //  */
    // @Test
    // public void testIsIncreasing_javadocExample() {
    //     TreeNode root = new TreeNode(-9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null,
    //                     new TreeNode(-6)
    //                 ),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(-3,
    //                 new TreeNode(8),
    //                 new TreeNode(33,
    //                     new TreeNode(0),
    //                     new TreeNode(77)
    //                 )
    //             )
    //         )
    //     );
    //     assertFalse(TraversalReview.isIncreasing(root));
    // }


    // //
    // // Tests for noSingleChildren(TreeNode)
    // //

    // /**
    //  * Tree:
    //  *   null (empty tree)
    //  */
    // @Test
    // public void testNoSingleChildren_null() {
    //     assertTrue(TraversalReview.noSingleChildren(null));
    // }

    // /**
    //  * Tree:
    //  *    7
    //  *
    //  * Single node (one level)
    //  */
    // @Test
    // public void testNoSingleChildren_singleNode() {
    //     TreeNode root = new TreeNode(7);
    //     assertTrue(TraversalReview.noSingleChildren(root));
    // }

    // /**
    //  * Tree:
    //  *         4
    //  *        / \
    //  *       2   6
    //  *      / \ / \
    //  *     1  3 5  8
    //  *
    //  * Perfectly full tree (every node has 0 or 2 children) → true
    //  */
    // @Test
    // public void testNoSingleChildren_fullTree() {
    //     TreeNode root = new TreeNode(4,
    //         new TreeNode(2,
    //             new TreeNode(1),
    //             new TreeNode(3)
    //         ),
    //         new TreeNode(6,
    //             new TreeNode(5),
    //             new TreeNode(8)
    //         )
    //     );
    //     assertTrue(TraversalReview.noSingleChildren(root));
    // }

    // /**
    //  * Tree:
    //  *         4
    //  *        / \
    //  *       2   6
    //  *      /     \
    //  *     1       7
    //  *
    //  * Node 2 has only one child (1) → false (three levels)
    //  */
    // @Test
    // public void testNoSingleChildren_falseCase() {
    //     TreeNode root = new TreeNode(4,
    //         new TreeNode(2,
    //             new TreeNode(1),
    //             null
    //         ),
    //         new TreeNode(6, null,
    //             new TreeNode(7)
    //         )
    //     );
    //     assertFalse(TraversalReview.noSingleChildren(root));
    // }

    // /**
    //  * Javadoc Example Tree:
    //  * 
    //  *              -9
    //  *             /   \
    //  *            2     5
    //  *           / \     \
    //  *          7   1    -3
    //  *         /         / \
    //  *        4         8  33
    //  *         \        /   \
    //  *         -6     0    77
    //  * 
    //  * Result: false (e.g., node 4 has only one child)
    //  */
    // @Test
    // public void testNoSingleChildren_javadocExample() {
    //     TreeNode root = new TreeNode(-9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null,
    //                     new TreeNode(-6)
    //                 ),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(-3,
    //                 new TreeNode(8),
    //                 new TreeNode(33,
    //                     new TreeNode(0),
    //                     new TreeNode(77)
    //                 )
    //             )
    //         )
    //     );
    //     assertFalse(TraversalReview.noSingleChildren(root));
    // }


    // //
    // // Tests for hasZero(TreeNode)
    // //

    // /**
    //  * Tree:
    //  *   null (empty tree)
    //  */
    // @Test
    // public void testHasZero_null() {
    //     assertFalse(TraversalReview.hasZero(null));
    // }

    // /**
    //  * Tree:
    //  *     0
    //  *
    //  * Single zero node (one level)
    //  */
    // @Test
    // public void testHasZero_singleZero() {
    //     TreeNode root = new TreeNode(0);
    //     assertTrue(TraversalReview.hasZero(root));
    // }

    // /**
    //  * Tree:
    //  *        5
    //  *       / \
    //  *      3   7
    //  *         /
    //  *        0
    //  *
    //  * Zero in a leaf (three levels)
    //  */
    // @Test
    // public void testHasZero_leafZero() {
    //     TreeNode root = new TreeNode(5,
    //         new TreeNode(3),
    //         new TreeNode(7,
    //             new TreeNode(0),
    //             null
    //         )
    //     );
    //     assertTrue(TraversalReview.hasZero(root));
    // }

    // /**
    //  * Tree:
    //  *         5
    //  *        / \
    //  *       3   7
    //  *      /     \
    //  *     1       9
    //  *
    //  * No zero anywhere (extended to three levels)
    //  */
    // @Test
    // public void testHasZero_noZero() {
    //     TreeNode root = new TreeNode(5,
    //         new TreeNode(3, new TreeNode(1), null),
    //         new TreeNode(7, null, new TreeNode(9))
    //     );
    //     assertFalse(TraversalReview.hasZero(root));
    // }

    // /**
    //  * Javadoc Example Tree:
    //  * 
    //  *              -9
    //  *             /   \
    //  *            2     5
    //  *           / \     \
    //  *          7   1    -3
    //  *         /         / \
    //  *        4         8  33
    //  *         \        /   \
    //  *         -6     0    77
    //  * 
    //  * Result: true (there is at least one zero)
    //  */
    // @Test
    // public void testHasZero_javadocExample() {
    //     TreeNode root = new TreeNode(-9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null,
    //                     new TreeNode(-6)
    //                 ),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(-3,
    //                 new TreeNode(8),
    //                 new TreeNode(33,
    //                     new TreeNode(0),
    //                     new TreeNode(77)
    //                 )
    //             )
    //         )
    //     );
    //     assertTrue(TraversalReview.hasZero(root));
    // }


    // //
    // // Tests for hasNonDivisible(TreeNode, int)
    // //

    // /**
    //  * Tree:
    //  *   null (empty tree)
    //  */
    // @Test
    // public void testHasNonDivisible_null() {
    //     // If node is null, should return false
    //     assertFalse(TraversalReview.hasNonDivisible(null, 5));
    // }

    // /**
    //  * Tree:
    //  *       9
    //  *      / \
    //  *     3   6
    //  *    / \
    //  *   12  15
    //  *
    //  * All values divisible by 3 (extended to three levels)
    //  */
    // @Test
    // public void testHasNonDivisible_allDivisible() {
    //     TreeNode root = new TreeNode(9,
    //         new TreeNode(3,
    //             new TreeNode(12),
    //             new TreeNode(15)
    //         ),
    //         new TreeNode(6)
    //     );
    //     assertFalse(TraversalReview.hasNonDivisible(root, 3));
    // }

    // /**
    //  * Tree:
    //  *         9
    //  *        / \
    //  *       3   5
    //  *      /     \
    //  *     6       10
    //  *
    //  * Node 5 not divisible by 3
    //  */
    // @Test
    // public void testHasNonDivisible_someNotDivisible() {
    //     TreeNode root = new TreeNode(9,
    //         new TreeNode(3, new TreeNode(6), null),
    //         new TreeNode(5, null,
    //             new TreeNode(10)
    //         )
    //     );
    //     assertTrue(TraversalReview.hasNonDivisible(root, 3));
    // }

    // /**
    //  * Tree:
    //  *        10
    //  *       /  \
    //  *     -20   30
    //  *      /
    //  *    -40
    //  *
    //  * All values divisible by 10
    //  */
    // @Test
    // public void testHasNonDivisible_negativeAndPositive() {
    //     TreeNode root = new TreeNode(10,
    //         new TreeNode(-20,
    //             new TreeNode(-40),
    //             null
    //         ),
    //         new TreeNode(30)
    //     );
    //     assertFalse(TraversalReview.hasNonDivisible(root, 10));
    // }

    // /**
    //  * Tree:
    //  *        8
    //  *       / \
    //  *      4   16
    //  *     /     \
    //  *    12      20
    //  *
    //  * All values divisible by 4 
    //  */
    // @Test
    // public void testHasNonDivisible_allDivisibleByFour() {
    //     TreeNode root = new TreeNode(8,
    //         new TreeNode(4, new TreeNode(12), null),
    //         new TreeNode(16, null,
    //             new TreeNode(20)
    //         )
    //     );
    //     assertFalse(TraversalReview.hasNonDivisible(root, 4));
    // }

    // /**
    //  * Tree:
    //  *        8
    //  *       / \
    //  *      4   9
    //  *     /     \
    //  *    12      15
    //  *
    //  * Node 9 not divisible by 4
    //  */
    // @Test
    // public void testHasNonDivisible_mixedDivisibility() {
    //     TreeNode root = new TreeNode(8,
    //         new TreeNode(4, new TreeNode(12), null),
    //         new TreeNode(9, null,
    //             new TreeNode(15)
    //         )
    //     );
    //     assertTrue(TraversalReview.hasNonDivisible(root, 4));
    // }

    // /**
    //  * Javadoc Example Tree:
    //  * 
    //  *              -9
    //  *             /   \
    //  *            2     5
    //  *           / \     \
    //  *          7   1    -3
    //  *         /         / \
    //  *        4         8  33
    //  *         \        /   \
    //  *         -6     0    77
    //  *
    //  * k = 3
    //  */
    // @Test
    // public void testHasNonDivisible_javadocExample() {
    //     TreeNode root = new TreeNode(-9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null,
    //                     new TreeNode(-6)
    //                 ),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(-3,
    //                 new TreeNode(8),
    //                 new TreeNode(33,
    //                     new TreeNode(0),
    //                     new TreeNode(77)
    //                 )
    //             )
    //         )
    //     );
    //     assertTrue(TraversalReview.hasNonDivisible(root, 3));
    // }


    // //
    // // Tests for concatenate(TreeNode)
    // //

    // /**
    //  * Tree:
    //  *   null (empty tree)
    //  */
    // @Test
    // public void testConcatenate_null() {
    //     assertEquals("", TraversalReview.concatenate(null));
    // }

    // /**
    //  * Tree:
    //  *     7
    //  *
    //  * Single node (one level)
    //  */
    // @Test
    // public void testConcatenate_singleNode() {
    //     TreeNode root = new TreeNode(7);
    //     assertEquals("7", TraversalReview.concatenate(root));
    // }

    // /**
    //  * Tree:
    //  *       5
    //  *      /
    //  *     3
    //  *    /
    //  *   1
    //  *
    //  * Left-leaning chain (three levels)
    //  */
    // @Test
    // public void testConcatenate_leftChain() {
    //     TreeNode root = new TreeNode(5,
    //         new TreeNode(3,
    //             new TreeNode(1),
    //             null
    //         ),
    //         null
    //     );
    //     // In-order: 1, 3, 5 → "135"
    //     assertEquals("135", TraversalReview.concatenate(root));
    // }

    // /**
    //  * Tree:
    //  *     2
    //  *      \
    //  *       4
    //  *        \
    //  *         6
    //  *
    //  * Right-leaning chain (three levels)
    //  */
    // @Test
    // public void testConcatenate_rightChain() {
    //     TreeNode root = new TreeNode(2, null,
    //         new TreeNode(4, null,
    //             new TreeNode(6)
    //         )
    //     );
    //     // In-order: 2, 4, 6 → "246"
    //     assertEquals("246", TraversalReview.concatenate(root));
    // }

    // /**
    //  * Tree:
    //  *           10
    //  *          /  \
    //  *         2    8
    //  *        / \    \
    //  *       1   4    12
    //  *            \
    //  *             5
    //  *
    //  * Mixed structure (three levels)
    //  */
    // @Test
    // public void testConcatenate_complexTree() {
    //     TreeNode root = new TreeNode(10,
    //         new TreeNode(2,
    //             new TreeNode(1),
    //             new TreeNode(4, null,
    //                 new TreeNode(5)
    //             )
    //         ),
    //         new TreeNode(8, null,
    //             new TreeNode(12)
    //         )
    //     );
    //     // In-order: 1, 2, 4, 5, 10, 8, 12 → "1245" + "10" + "8" + "12" = "124510812"
    //     assertEquals("124510812", TraversalReview.concatenate(root));
    // }

    // /**
    //  * Javadoc Example Tree:
    //  * 
    //  *              -9
    //  *             /   \
    //  *            2     5
    //  *           / \     \
    //  *          7   1    -3
    //  *         /         / \
    //  *        4         8  33
    //  *         \        /   \
    //  *         -6     0    77
    //  * 
    //  * In-order concatenation: "4-6721-958-303377"
    //  */
    // @Test
    // public void testConcatenate_javadocExample() {
    //     TreeNode root = new TreeNode(-9,
    //         new TreeNode(2,
    //             new TreeNode(7,
    //                 new TreeNode(4, null,
    //                     new TreeNode(-6)
    //                 ),
    //                 null
    //             ),
    //             new TreeNode(1)
    //         ),
    //         new TreeNode(5, null,
    //             new TreeNode(-3,
    //                 new TreeNode(8),
    //                 new TreeNode(33,
    //                     new TreeNode(0),
    //                     new TreeNode(77)
    //                 )
    //             )
    //         )
    //     );
    //     assertEquals("4-6721-958-303377", TraversalReview.concatenate(root));
    // }
}
