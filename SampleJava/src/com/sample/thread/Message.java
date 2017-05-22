package com.sample.thread;

import java.util.Date;

public class Message {
	private int messageId;
	private String messageDescription;
	private int messageCount;
	
	
	
	public Message(int messageId, String messageDescription, int messageCount) {
		super();
		this.messageId = messageId;
		this.messageDescription = messageDescription;
		this.messageCount = messageCount;
	}
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageDescription() {
		return messageDescription;
	}
	public synchronized void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}
	public int getMessageCount() {
		return messageCount;
	}
	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}
	
	public void createMessage()
	{
		synchronized ("Hello") {
			
			System.out.println("Time is:"+new Date());
		}
		
	}
	

}
