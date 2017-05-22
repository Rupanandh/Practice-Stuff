package com.sample.thread;

import java.util.List;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		MessageResource messageResource = new MessageResource();
		List<Message> messages =messageResource.getMessagesList();
		
		for (Message message : messages) {
			
			message.setMessageDescription("Runnable Thread");
			System.out.println(message.getMessageDescription()+" "+message.getMessageId());
			message.createMessage();
		}
		
	}

}
