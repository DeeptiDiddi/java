class allnegleft{
    public static void main(String[] args) {
        int[] nums = {10, -5, 7, -2, 8, -3};
        int position = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = nums[position];
                nums[position] = nums[i];
                nums[i] = temp;

                position++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
