class Solution {
    public String[] createGrid(int m, int n) {
        String row = "." + "#".repeat(n - 1);
        String[] res = new String[m];
        for (int i = 0; i < m - 1; i++) {
            res[i] = row;
        }
        res[m - 1] = ".".repeat(n);
        return res;
    }
}