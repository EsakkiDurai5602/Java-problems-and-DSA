package Algorithms.Sorting;

class KadansAlgorithm {
    public static int KadansAlgo(int[] nums) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=currSum+nums[i];
            if(temp<nums[i]){
                currSum=nums[i];
            }else{
                currSum=temp;
            }
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    
    }
    public static void main(String[] args){
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(KadansAlgo(nums));
    }
}

