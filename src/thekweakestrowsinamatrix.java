class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int [] sortedResult = new int[k];

        for (int i=0;i<mat.length;i++){
            q.add(new int[]{binarySearch(mat[i]),i});
        }

        for (int i=0;i<k;i++){
            sortedResult[i]=q.remove()[1];

        }

        return sortedResult;
    }
    public int binarySearch (int [] array){
        int start=0;
        int end=array.length-1;
        int index=0;

        while (start <= end){
            int mid = start + (end-start) / 2;
            
            if (array[mid]==1){
                index=mid+1;
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return index;
    }
}
