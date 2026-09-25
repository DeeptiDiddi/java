class countodd{
 public static void main(String args[]){
  int[] nums = {10, 15, 7, 20, 33, 40};
  int oddCount = 0;
  for(int i=0;i<nums.length;i++){
   if(nums[i]%2!=0){
    oddCount++;
   }
  }
  System.out.println("Number of odd elements: " + oddCount);
 }
}
