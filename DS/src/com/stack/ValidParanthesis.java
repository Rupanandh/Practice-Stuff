package com.stack;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		
		String data="(])";
		
		System.out.println(isValid(data)	);	
		
	}

	private static boolean isValid(String data) {
		char[] dataArray = data.toCharArray();
		Stack<Character> dataStack = new Stack<Character>();
		for (char c : dataArray) {
			
			if(c=='('||c=='{'||c=='[')
			{
				dataStack.push(c);
			}
			else{
				char constr = 0;
				 switch(c)
				    {
				        case ')':
				        	constr='(';
				            break;
				        case '}':
				        	constr='{';
				            break;
				        case ']':
				        	constr='[';
				            break;
				    }
				try {
					
					if (constr == dataStack.peek()) {
						dataStack.pop();

					}
				} catch (Exception e) {
					return false;
				}
			}
		}
		return dataStack.isEmpty();

		
	}

}
