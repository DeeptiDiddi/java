class negt {
    public static void main(String[] args) {
     int[] nums = {10, -5, 7, -2, 8, -3};
        for (int i = 0; i < nums.length; i++) {
           for (int j = i+1; j <nums.length; j++) {
                if (nums[j] < 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                } 
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
