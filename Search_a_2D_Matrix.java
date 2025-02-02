public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow
            int row = mid / n;
            int col = mid % n;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true; // Found the target
            } else if (midValue < target) {
                left = mid + 1; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }
        return false; // Target not found
    }

    public static void main(String[] args) {
        Search_a_2D_Matrix searcher = new Search_a_2D_Matrix();

        int[][] matrix1 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(searcher.searchMatrix(matrix1, 3)); // Expected: true
        System.out.println(searcher.searchMatrix(matrix1, 13)); // Expected: false
    }
}
