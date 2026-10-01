class firstrepeated {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 20, 40, 10};
    for(int i = 0; i < nums.length; i++) {
        boolean duplicate = false;
        for(int j = 0; j < i; j++) {
            if(nums[i] == nums[j]) {
                duplicate = true;
                System.out.println("First repeated number: " + nums[i]);
                return;
            }
        }
    
        }
    }
}
