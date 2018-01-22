package arrays.reshapeMatrix;

/**
 * https://leetcode.com/problems/reshape-the-matrix/description/
 *
 * Input: nums = [[1,2],[3,4]] r = 1, c = 4
 * Output: [[1,2,3,4]]
 * Explanation: The row-traversing of nums is [1,2,3,4].
 * The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 *
 * Input: nums = [[1,2], [3,4]] r = 2, c = 4
 * Output: [[1,2], [3,4]]
 * Explanation: There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix.
 * So output the original matrix.

 * Reshaping strategy:  find the linear representation and re‐
 * cut based on the number of rows in the reshaped array.
 */
public class ReshapeMatrix {

    public static void main(String[] args) {
        int nums[][] = new int[][]{{1,2,6},{3,4,5}};
        System.out.println(matrixReshape(nums,3,2));
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int linearLength = nums.length * nums[0].length;
        if(r * c != linearLength) {
            return nums;
        }
        int linear[] = new int[linearLength];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                linear[index] = nums[i][j];
                index++;
            }
        }

        int reshaped[][] = new int[r][c];
        int l = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshaped[i][j] = linear[l];
                l++;
            }
        }

        return reshaped;
    }
}
