package com.sample.override;


public class Child extends Parent {
	
	
	@Override
	void followMe()  {
		
		System.out.println(1/0);
		
	}
	
	static void unfollowMe()
	 {
		 System.out.println("Child");
	 }
	 
	 public static void main(String[] args)
	 {
		 unfollowMe();
		 Parent.unfollowMe();
	 }

}
