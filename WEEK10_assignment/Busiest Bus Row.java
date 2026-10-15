public class Main {
    static void busiestRow(int[][] grid) {
        int bestRow = 0, max = -1;

        for (int i = 0; i < grid.length; i++) {
            int sum = 0;

            for (int j = 0; j < grid[i].length; j++)
                sum += grid[i][j];

            if (sum > max) {
                max = sum;
                bestRow = i;
            }
        }

        System.out.println("Row " + bestRow + ", Total " + max);
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        busiestRow(grid);
    }
}
