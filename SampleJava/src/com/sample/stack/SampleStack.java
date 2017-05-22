package com.sample.stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class SampleStack {

	static Stack<Character> stack = new Stack<Character>();
	static String pathname = "C:/Workspace/SampleJava/src/com/sample/collections/input.txt";

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File(pathname));
		
		while (scanner.hasNextLine()) {
			//boolean pop=false;
			char[] charArray = scanner.nextLine().toCharArray();
			if ((charArray.length % 2) == 0) {
				 Stack<Character> stacktemp = new Stack<Character>();
				for (int i = 0; i < charArray.length; i++) {
					//pop=false; 
					if (charArray[i] == '{' || charArray[i] == '['
							|| charArray[i] == '(') {
						stack.push(charArray[i]);
					} else if ((charArray[i] == '}' || charArray[i] == ']'
							|| charArray[i] == ')')) {						
					try{	stack.pop();	}
						//pop=true;
					catch(EmptyStackException ese)
					{
						stacktemp.push(charArray[i]);
					}
					}
				}

				if (stack.isEmpty()&&stacktemp.isEmpty()) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
			} else {
				System.out.println("false");
			}

		}

	}

}
