class Solution {
    public boolean check(int[] nums) {
        int breakPoint =-1;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            small=Math.min(small,nums[i]);
            if(nums[i]>nums[i+1]){
                //small=Math.min(small,nums[i+1]);
                breakPoint=i+1;
                break;
            }

        }
        System.out.println("Small: "+small );
        
        if(breakPoint>-1){
            System.out.println(" breakpoint: "+nums[breakPoint]);
        for(int i=breakPoint;i<nums.length-1;i++){
            if( nums[i]>nums[i+1]) return false;

        }
        if(nums[nums.length-1]>nums[0]) return false;
        
        }
        
        return true;
    }
}