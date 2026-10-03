class seclargestdup {
    public static void main(String[] args) {
        int[] nums = {10, 40, 25, 40, 18, 25};
        int largest;
        int secondLargest;
        if (nums[0] > nums[1]) {
            largest = nums[0];
            secondLargest = nums[1];
        } else {
            largest = nums[1];
            secondLargest = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        System.out.println("Second largest number with duplicates: " + secondLargest);
       
    }
}
