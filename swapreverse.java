class swapreverse{
 public static void main(String args[]){
  int[] nums = {10, 20, 30, 40, 50};
  int start=0;
  int end=nums.length-1;
  while(start<end){
   int temp=nums[start];
   nums[start]=nums[end];
   nums[end]=temp;
   start++;
   end--;
  }
  for(int i=0;i<nums.length;i++){
   System.out.print(nums[i] + " ");
  }
 }
}
