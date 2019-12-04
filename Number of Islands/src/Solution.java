class Solution {

    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }

        int nums_row = grid.length;
        int nums_column = grid[0].length;
        UnionFind uf = new UnionFind(grid);
        for(int r = 0; r < nums_row; r++) {
            for(int c = 0; c < nums_column; c++) {
                if(grid[r][c] == '1') {
                    if(r - 1 >= 0 && grid[r - 1][c] == '1') {
                        uf.union(r * nums_row + c, (r-1) * nums_row + c);
                    }
                    if (r + 1 < nums_row && grid[r+1][c] == '1') {
                        uf.union(r * nums_row + c, (r+1) * nums_row + c);
                    }
                    if (c - 1 >= 0 && grid[r][c-1] == '1') {
                        uf.union(r * nums_row + c, r * nums_row + c - 1);
                    }
                    if (c + 1 < nums_row && grid[r][c+1] == '1') {
                        uf.union(r * nums_row + c, r * nums_row + c + 1);
                    }
                }
            }
        }
        return uf.getCount();
    }

    public static void main(String[] args) {
        char input[][] = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(input));
    }

}