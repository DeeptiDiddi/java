class targetcount{
    public static void main(String[] args) {
      int[] nums={10, 20, 10, 30, 10, 40};
      int target= 10;
      int count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
             count++;
        }
      }
      System.out.println("Number of occurrences: " + count);
    }
}
    
