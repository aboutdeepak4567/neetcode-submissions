class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int arr[] = new int[m*n];
        int index = 0;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[index++]=matrix[i][j];
            }          
        }
        int fi = 0;
        int li = arr.length-1;
        while(li>=fi){
            int mid = (fi+li)/2;
            if(arr[mid] == target){
                return true;

            }else if(arr[mid]>target){
                li = mid-1;
            }else{
                fi = mid+1;
            }

        }
        return false;

        
    }
}
