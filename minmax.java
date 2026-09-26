class minmax{
 public static void main(String args[]){
  int[] nums = {15, 7, 25, 3, 40, 12};
  int min=nums[0];
  int max=nums[0];
  for(int i=1;i<nums.length;i++){
   if(nums[i]<min){
    min=nums[i];
   } else if(nums[i]>max){
    max=nums[i];
   }
  }
  System.out.println("Minimum element: " + min);
  System.out.println("Maximum element: " + max);
 }
}
