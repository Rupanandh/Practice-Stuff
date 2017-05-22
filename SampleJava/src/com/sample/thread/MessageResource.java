package com.sample.thread;

import java.util.ArrayList;
import java.util.List;

public class MessageResource {
	
	private List<Message> messagesList;

	public List<Message> getMessagesList() {
		
		return messagesList;
	}

	public void setMessagesList(List<Message> messagesList) {
		this.messagesList = messagesList;
	}
	
	
	public MessageResource()
	{
		if(messagesList==null)
		{
			messagesList= new ArrayList<Message>();
			
		}
		
		messagesList.add(new Message(1, "message one", 1));
		messagesList.add(new Message(2, "message two", 2));
		messagesList.add(new Message(3, "message three", 3));
		messagesList.add(new Message(4, "message four", 4));
		messagesList.add(new Message(5, "message five", 5));
	}
	
	

}
