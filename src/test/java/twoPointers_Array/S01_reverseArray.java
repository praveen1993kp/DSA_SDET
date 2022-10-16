package twoPointers_Array;

import org.junit.Assert;
import org.junit.Test;

public class S01_reverseArray {

	/*
	 * PROBLEM STATEMENT 
	 * 
	 * 
	 * Given an input array, reverse the array using two pointers
	 * 
	 * 
	 */ 
	 
	/*
	 * 1. Did I understand the problem? 
	 * 	yes or no 
	 * 	If no ask the person to provide
	 * 	with more details with examples 
	 * 	If yes go to the next step What is the
	 * 	input(s)? What is the expected output? 
	 * 
	 * 	Do I have any constraints to solve the
	 * 	problem? Do I have all the information to go to the next steps 
	 * 	How big is your test data set will be? 
	 * 
	 * 2. Test data set Minimum 3 data set including positive, negative and edge
	 * Validate with the interviewer if the data set is fine by his/ her assumptions
	 * 
	 * 
	 * 3. Do I know to solve it? 
	 * 	Yes- great is there an alternate ? 
	 * 	No - can I break the problem into sub problems?
	 * 
	 * 
	 * 4. Ask for hint (if you dont know how to solve
	 * this) 
	 * 
	 * 5. Do I know alternate solutions as well Yes- what are those? No- that
	 * is still fine, proceed to solve by what you know 
	 * 
	 * 6. If you know the alternate
	 * solution find out the O-notations (performance) 
	 * 
	 * 
	 * 7. Then, explain either both are the best (depends on
	 * the time) 
	 * 	Approach 1:- start with the worst-> improve (optimize) -> End up
	 * with the best 
	 * 	Approach 2: Write down the options and benefits and code the
	 * best 
	 * 
	 * 8. Start always with the Pseudo code 
	 * 
	 * 9. Test against different test data
	 * 
	 * 10. If it fails then debug to solve it
	 */
	
	@Test
	public void positive() {
		//Positive Test Data
		int[] nums = {5,4,3,2,1};
		int[] output = {1,2,3,4,5};
		Assert.assertArrayEquals(reverseArray_WithoutTemp(nums), output);
	}
	
	@Test
	public void negative() {
		//Edge Case Test Data
		int[] nums = {5};
		int[] output = {5};
		Assert.assertArrayEquals(reverseArray_WithoutTemp(nums), output);
	}
	
	@Test
	public void edge() {
		//Negative Test Data
		int[] nums = {};
		int[] output = {};
		Assert.assertArrayEquals(reverseArray_WithoutTemp(nums), output);
	}
	
	/*
	 * --- Pseudo Code ---
	 * 
	 * 1. Create two pointers left = 0 and right = nums.length-1
	 * 2. Swap the values at both Pointers
	 * 3. Traverse and execute step 2 till left < right
	 * 4. Return the array
	 * 
	 */	
	
	private int[] reverseArray(int[] nums) {
		int left = 0,right=nums.length-1;
		while(left<right) {
			int temp = nums[left];
			nums[left++] = nums[right];
			nums[right--] = temp;
		}
		return nums;
	}
	
	private int[] reverseArray_WithoutTemp(int[] nums) {
		int left = 0,right=nums.length-1;
		while(left<right) {
			nums[left] = nums[left] + nums[right];
			nums[right] = nums[left] - nums[right];
			nums[left] = nums[left] - nums[right];
			left++;
			right--;
		}
		return nums;
	}
}
