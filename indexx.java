class indexx{
    public static void main(String[] args) {
      int[] nums = {10, 25, 7, 40, 18};
      int target= 40;
      int idx=-1;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
             idx=i;
            break;
        }
      }
      if (idx !=-1){
       System.out.println("Number found at index: " + idx);
      } else {
       System.out.println("Number not found");
      }
    }
}
