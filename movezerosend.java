class movezerosend {

    public static void main(String[] args) {

        int[] nums = {1, 3, 0, 0, 12};

        int position = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {

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
