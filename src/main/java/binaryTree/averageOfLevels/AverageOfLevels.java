package binaryTree.averageOfLevels;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
 *
 */
public class AverageOfLevels {
    public static void main(String[] args) {

    }

    public static List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> result = new ArrayList<>();


        return result;
    }

    private int getData(TreeNode node) {
        if(node == null) return 0;
        int left = getData(node.left);
        int right = getData(node.right);

        return node.val;
    }

}
