class negpos{
    public static void main(String[] args) {
     int []nums={10, -5, 0, 7, -2, 0, 8};
     int positiveCount = 0;
     int negativeCount = 0;
     int zeroCount = 0;
      for(int i=0;i<nums.length;i++){
       if (nums[i]>0){
        positiveCount++;
       }
       else if(nums[i]<0){
        negativeCount++;
       }
       else{
        zeroCount++;
       }
    }
      System.out.println("Positive numbers: " + positiveCount);
      System.out.println("Negative numbers: " + negativeCount); 
      System.out.println("Zero numbers: " + zeroCount);
    }
}
