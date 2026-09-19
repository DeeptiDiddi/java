class largesttt{
    public static void main(String[] args) {
      int[] nums = {10, 25, 7, 40, 18};
      int largest = nums[0];
      for(int i=1;i<nums.length;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
      }
        System.out.println("Largest number: " + largest);
    }
}
