public class ZeroMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        int INF = 10000;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) continue;
                int up = i > 0 ? res[i - 1][j] : INF;
                int left = j > 0 ? res[i][j - 1] : INF;
                res[i][j] = 1 + Math.min(up, left);
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 0) continue;
                int down = i < m - 1 ? res[i + 1][j] : INF;
                int right = j < n - 1 ? res[i][j + 1] : INF;
                res[i][j] = Math.min(res[i][j], 1 + Math.min(down, right));
            }
        }

        return res;
    }
}
