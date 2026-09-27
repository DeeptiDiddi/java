class palindromelist{
public static void main(String args[]){
  int[] nums = {10, 20, 30, 20, 10};
  int start=0;
  int end=nums.length-1;
  while(start<end){
   if (nums[start]!=nums[end]){
    System.out.println("Not a palindrome");
    return;
   }
   start++;
   end--;
  }
  System.out.println("Is a palindrome");
 }
}
