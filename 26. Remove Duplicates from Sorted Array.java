/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
*/

public int removeDuplicates(int[] nums) {
        //if is an empty string, return 0;
        if (nums.length == 0)
            return 0;
            
        //Set two pointers, one slower, one faster.
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
        //if equal, move the faster pointer only. If not equal, move both pointer and copy the value to nums[i + 1].
            if (nums[i] != nums[i - 1])
                nums[length++] = nums[i];
        }
        
        return length; 
    }
