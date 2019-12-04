class UnionFind {
    private int count;
    private int[] parent;
    private int[] rank;

    UnionFind(char[][] grid) {
        count = 0;
        int m = grid.length;
        int n = grid[0].length;
        parent = new int[m * n];
        rank = new int[m * n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    parent[i * n + j] = i * n + j;
                    count++;
                }
                rank[i * n + j] = 0;
            }
        }
    }

    private int find(int i) {
        if(parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    void union(int x, int y) {
        int rootx = find(x);
        int rooty = find(y);
        if(rootx != rooty) {
            if(rank[rootx] > rank[rooty]) {
                parent[rooty] = rootx;
            }else if(rank[rootx] < rank[rooty]) {
                parent[rootx] = rooty;
            }else {
                parent[rooty] = rootx;
                rank[rootx]++;
            }
            count--;
        }
    }

    int getCount() {
        return count;
    }
}