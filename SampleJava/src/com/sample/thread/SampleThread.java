package com.sample.thread;

import java.util.List;

public class SampleThread extends Thread {
	
 @Override
public void run() {
	 MessageResource messageResource = new MessageResource();
		List<Message> messages =messageResource.getMessagesList();
		
		for (Message message : messages) {
			
			message.setMessageDescription("Sample Thread");
			System.out.println(message.getMessageDescription()+" "+message.getMessageId());
			message.createMessage();
		}
}
}
