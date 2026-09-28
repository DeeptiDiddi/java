class removeduplicates {
 public static void main(String[] args) {
 int[] nums = {10, 20, 10, 30, 20, 40};
 for(int i=0;i<nums.length;i++){
   boolean duplicate = false;
  for(int j=i+1;j<nums.length;j++){
   if(nums[i]==nums[j]){
      duplicate = true;
     break;
   }
  }

  if(!duplicate){
   System.out.print(nums[i] + " ");
  }
   }
  }
 }
 
