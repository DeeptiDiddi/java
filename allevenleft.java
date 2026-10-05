class allevenleft{
    public static void main(String[] args) {
        int[] nums = {10, 7, 4, 9, 12, 3, 8};
        int position = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
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
