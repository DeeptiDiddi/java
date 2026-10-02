class firstnonrepeated {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 20, 40, 10};
    for(int i = 0; i < nums.length; i++) {
        boolean duplicate = false;
        for(int j = 0; j < nums.length; j++) {
            if(i != j && nums[i] == nums[j]) {
                duplicate = true;
                break;
            }
        }
        if(duplicate==false) {
             System.out.println("First non-repeated number: " + nums[i]);
             return;
            }
        }
    
        }
    }
