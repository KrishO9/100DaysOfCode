class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int first = 0;
        int last = n - 1;
        while (first < last) {
            int[] temp = matrix[first];
            matrix[first] = matrix[last];
            matrix[last] = temp;
            first++;
            last--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
    }
}