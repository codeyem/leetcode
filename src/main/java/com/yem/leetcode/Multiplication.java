package com.yem.leetcode;public class Multiplication {	public static void main(String[] args) {	}	/**	 * 初始化两个空数组 L 和 R。对于给定索引 i，L[i] 代表的是 i 左侧所有数字的乘积，R[i] 代表的是 i 右侧所有数字的乘积。	 * 我们需要用两个循环来填充 L 和 R 数组的值。对于数组 L，L[0] 应该是 1，因为第一个元素的左边没有元素。对于其他元素：L[i] = L[i-1] * nums[i-1]。	 * 同理，对于数组 R，R[length-1] 应为 1。length 指的是输入数组的大小。其他元素：R[i] = R[i+1] * nums[i+1]。	 * 当 R 和 L 数组填充完成，我们只需要在输入数组上迭代，且索引 i 处的值为：L[i] * R[i]。	 *	 */	public int[] productExceptSelf(int[] nums) {		int[] left = new int[nums.length];		int[] right = new int[nums.length];		int[] result = new int[nums.length];		for (int i = 0; i < nums.length; i++) {			if(i == 0){				left[i] = 1;			}else {				left[i] = left[i-1] * nums[i -1];			}		}		for (int i = nums.length -1; i >= 0; i--) {			if(i == nums.length -1) {				right[i] = 1;			}else {				right[i] = right[i+1] * nums[i + 1];			}		}		for(int i = 0; i < nums.length; i++) {			result[i] = left[i] * right[i];		}		return result;	}	public int[] productExceptSelfPlus(int[] nums) {		int[] left = new int[nums.length];		int[] result = new int[nums.length];		for (int i = 0; i < nums.length; i++) {			if(i == 0){				left[i] = 1;			}else {				left[i] = left[i-1] * nums[i -1];			}		}		for (int i = nums.length -1; i >= 0; i--) {			if(i == nums.length -1) {				result[i] = left[i] ;			}else {				result[i] = left[i] * result[i + 1] * nums[i + 1];			}		}		return result;	}}