class seclargest{
 public static void main(String[] args){
  int [] nums={30, 25, -1, 40, 18};
  int largest=nums[0];
  int secondLargest=nums[0];
  for(int i=0;i<nums.length;i++){
    if(nums[i]>largest){
       secondLargest=largest;
       largest=nums[i];
    }else if(nums[i]>secondLargest && nums[i]!=largest){
       secondLargest=nums[i];
    }
  }
  System.out.println("Second largest number: " + secondLargest);
 }
}
