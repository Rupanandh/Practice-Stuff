import java.util.ArrayList;
import java.util.Collections;


public class MinStack {
	
	 ArrayList<Integer> al = new ArrayList<Integer>();
	
	void push(int element){
		al.add(element);
	}
	
	 int pop(){
		
	return	al.remove(al.size()-1);
		
		
	}
	
	 int top()
	{
		return al.get(al.size()-1);
	}
	
	 int getMin()
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.addAll(al);
		Collections.sort(temp);
		return temp.get(0);
	}
	
	
	public static void main(String[] args)
	{
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());		
		System.out.println(minStack.pop());
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}

}
