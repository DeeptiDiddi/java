class negtnumleft {
    public static void main(String[] args) {
     int[] nums = {10, -5, 7, -2, 8, -3};
        for (int i = 0; i < nums.length; i++) {
           for (int j = 0; j <i; j++) {
                if (nums[i] < 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
            
                } 
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
