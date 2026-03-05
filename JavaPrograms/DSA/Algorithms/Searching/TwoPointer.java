package Algorithms.Searching;

class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        int target=10;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int total=arr[left]+arr[right];
            if(total==target){
                System.out.print(arr[left]+" "+arr[right]);
                return ;
            }
            else if(total>target){
                right--;
            }
            else{
                left++;
            }
        }
    }
}