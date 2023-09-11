class Solution {
    public static boolean binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){

            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1])
            {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }
}
