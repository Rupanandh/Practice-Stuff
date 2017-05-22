package cache;

import java.util.Stack;

public class StackTest {
	
	
	public static void main(String[] args)
	{
		isValid("]");
	}

	
	 public static boolean isValid(String s) {
		 
		 
	        
	        Stack<Character> dataStack = new Stack<Character>();
	        
	       for( Character c: s.toCharArray())
	       {
	           if(c.equals('(') ||c.equals('[')||c.equals('{'))
	           {
	             dataStack.push(c);
	           }
	             else if(c.equals(')') && !dataStack.isEmpty()&& dataStack.peek()=='(')
	              {
	                 dataStack.pop();
	             }
	             else if(c.equals(']') && !dataStack.isEmpty()&& dataStack.peek()=='[')
	              {
	                 dataStack.pop();
	             }
	             else if(c.equals('}') && !dataStack.isEmpty()&& dataStack.peek()=='{')
	              {
	                 dataStack.pop();
	             }
	             else if(dataStack.isEmpty() && c !=null)
	             {
	            	 return false;
	             }
	           
	       }
	       
	       System.out.println(dataStack.isEmpty());
	       
	       return dataStack.isEmpty();
	       
	       
	       
	        
	    }
}
