package 题库;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int startX = 0, startY = 0;
        int offset = 1;
        int count = 1;
        int loop = 1;   //记录当前圈数
        int i, j;
        while (loop <= n / 2) {
            for (j = startY; j < n - offset; j++) {
                nums[startX][j] = count++;
            }
            for (i = startX; i < n - offset; i++) {
                nums[i][j] = count++;
            }
            for (j = n - offset; j > startY; j--) {
                nums[i][j] = count++;
            }
            for (i = n - offset; i > startX; i--) {
                nums[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }

        if (n % 2 == 1) {
            nums[startX][startY] = count;
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[][] result = solution.generateMatrix(n);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}