class notfirstrepeated {
    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 30, 20, 40};
        for(int i = 0; i < nums.length; i++) {
            boolean duplicate = false;
            for(int j = 0; j < i; j++) {
                if(nums[i] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                int count = 0;
              for(int j = 0; j < nums.length; j++) {
                  if(nums[i] == nums[j]) {
                        count++;
                    }
                }
                if(count == 1) {
                    System.out.println("First non-repeated number: " + nums[i]);
                    return;
                }
            }
        }
    }
}
