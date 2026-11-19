class Solution {
    public int maximumSum(int[] arr) {
        int noDelete=arr[0];
        int oneDelete=0;

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            int temp=noDelete;

            noDelete=Math.max(arr[i],noDelete+arr[i]);

            oneDelete=Math.max(oneDelete+arr[i],temp);

            max=Math.max(max,Math.max(oneDelete,noDelete));


        }
        return max;
    }
}