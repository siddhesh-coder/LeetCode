class SearchInsertPosition1{
    static int SearchInsertPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
            if (nums[mid] < target)
                return mid + 1;
            else
                return mid;
    }
        public static void main (String[]args){
            int[] nums = {1, 3, 5, 6};
            int target = 7;
            int index = SearchInsertPosition(nums, target);
            System.out.println(index);
        }
}
