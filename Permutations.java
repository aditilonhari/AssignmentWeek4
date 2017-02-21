/*
Problem Statement : Given a collection of numbers, return all possible permutations.
*/

public class Solution {
    private boolean[] marked;
    private ArrayList<ArrayList<Integer>> result;
    private ArrayList<Integer> A;
    private int size;
    
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    
	    size = a.size();
	    marked = new boolean[size];
	    result = new ArrayList<>();
	    this.A = a;
	    
	    recursivePermute(0, new ArrayList<Integer>());
	    return result;
	}
	
	public void recursivePermute(int idx, ArrayList<Integer> temp){
	    
	    if(idx == size){
	        result.add(new ArrayList<>(temp));
	        return;
	    }
	    
	    for(int i=0; i<size; i++){
	        if(!marked[i]){
	            marked[i] = true;
	            temp.add(A.get(i));
	            recursivePermute(idx +1, temp);
	            marked[i] = false;
	            temp.remove(temp.size() -1);
	        }
	    }
	}
}

