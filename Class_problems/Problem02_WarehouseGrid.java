public class Problem02_WarehouseGrid {

    static int[] warehouseSummary(int[][] grid) {
        long total = 0;
        int max = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];
                if (grid[i][j] > max) {
                    max = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new int[] {(int) total, maxRow, maxCol};
    }

    public static void main(String[] args) {
        int[][] grid = {{4, 9, 2}, {7, 1, 6}, {3, 12, 5}};
        int[] r = warehouseSummary(grid);
        System.out.println("total = " + r[0] + ", maxCoordinate = (" + r[1] + ", " + r[2] + ")");
    }
}
