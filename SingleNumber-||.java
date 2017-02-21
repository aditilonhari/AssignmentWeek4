/*
Problem Statement : Given an array of integers, every element appears thrice except for one which occurs once. Find that element which does not appear thrice.
Note: Your algorithm should have a linear runtime complexity.
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    
	    int [] bits;
	    bits = new int[32];
	    
	    for (int num : a) {
	        
	        for (int i = 0; i < 32; i++) {
	            bits[i] += (1 & (num >> i));
	            bits[i] %= 3;
	        }
	        
	    }
	    
	    int number = 0;
	    
	    for (int i = 31; i >= 0; i--) {
	        number = number * 2 + bits[i];
	    }
	    
	    return number;
	}
}

