class moveallzerosendd{
public static void main(String args[]){
  int[] nums ={0, 1, 0, 3, 12};
  for (int i=0;i<nums.length;i++){
    
      if(nums[i]!=0 && nums[i+1]==0){
        int temp=nums[i];
        nums[i]=nums[i+1];
        nums[i+1]=temp;
        break;
      }
    
  }
    for(int i=0;i<nums.length;i++){
     System.out.print(nums[i]+" ");
    }
    }
}
