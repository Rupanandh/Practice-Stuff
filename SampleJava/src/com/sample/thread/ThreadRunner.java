package com.sample.thread;

public class ThreadRunner extends Thread {
	
	
	public static void main(String[] args)
	{
		MessageResource messageResource = new MessageResource();
		
		RunnableThread runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		thread.start();
		System.out.println(" ");
		
		SampleThread sampleThread = new SampleThread();
		sampleThread.start();
		
		System.out.println(" ");
		for(Message message:messageResource.getMessagesList())
		{
			System.out.println(message.getMessageDescription()+" "+message.getMessageId());
		}
		
		
		
	
	}
	
	

}
