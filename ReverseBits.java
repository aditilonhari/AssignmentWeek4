/*
Problem Statement : Reverse bits of an 32 bit unsigned integer
*/

public class Solution {
	public long reverse(long a) {
	     long reverse = 0;
	     
	     for(int i=0; i<32; i++){
	         long bit_i = 1 & (a >> i);
	         reverse <<= 1;
	         reverse |= bit_i;
	     }
	     
	     return reverse;
	}
}
