class smallest{
    public static void main(String[] args) {
     int[] nums={10, 25, 7, 40, 18};
     int small=nums[0];
     for(int i=1;i<nums.length;i++){
        if(nums[i]<small){
            small=nums[i];
        }
     }
     System.out.println("The smallest number is: " + small);
    }
}
