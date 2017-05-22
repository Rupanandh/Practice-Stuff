package com.cerner;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Prescription {
	
	private Calendar startDate = Calendar.getInstance();
	private Calendar endDate = Calendar.getInstance();
	 enum frequency { fourhours, onceaday, withmeals, beforemeals, asneeded, forever }
	frequency freq;
	private int doses = 0;
	
	public Calendar calcEndDate(Calendar StartDate, frequency freq, int doses){ 
		this.endDate = StartDate;
		endDate.setTime(StartDate.getTime());
		System.out.println("endDate:::"+endDate.getTime());
		switch(freq){
		
		case fourhours:
			for(int i = 0; i<doses; i++){
				endDate.add(Calendar.HOUR_OF_DAY, 4);
				System.out.println("HOUR_OF_DAY added:::"+endDate.getTime());
			}
			break;
		case onceaday:
			for(int i = 0; i<doses; i++){
				endDate.add(Calendar.DAY_OF_MONTH, 1);
			}
			break;
		case withmeals:
			for(int i = 0; i<doses; i++){
				endDate.add(Calendar.DAY_OF_MONTH, 1);
			}
			break;
		case beforemeals:
			for(int i = 0; i<doses; i++){
				endDate.add(Calendar.DAY_OF_MONTH, 1);
			}
			break;
		case asneeded:
				endDate.add(Calendar.YEAR, 9999);
			break;
		}
		return endDate;
	}
	
	private Calendar calcEndDate(Calendar StartDate, frequency freq){ 
		endDate = StartDate;
		endDate.add(Calendar.YEAR, 100);
		return endDate;
	}
	
	public void NurseReminder(Calendar startDate, Calendar endDate, frequency freq, int doses){
		Calendar temp = Calendar.getInstance();
		temp = startDate;
		if(endDate == null){
			if(doses == 0)
			calcEndDate(startDate, freq);
			else
				endDate=calcEndDate(startDate, freq, doses);
		}
		switch(freq){
		
		case fourhours:
			while(temp.compareTo(endDate)<=0){
				temp.add(Calendar.HOUR_OF_DAY, 4);
				System.out.println("Nurse give medication to patient"+ temp.getTime());
			}
			break;
		case onceaday:
			while(temp.compareTo(endDate)<=0){
				temp.add(Calendar.DAY_OF_MONTH, 1);
				System.out.println("Nurse give medication to patient"+ temp);
			}
			break;
		case withmeals:
			while(temp.compareTo(endDate)<=0){
				temp.add(Calendar.DAY_OF_MONTH, 1);
				System.out.println("Nurse give medication to patient"+ temp);
			}
			break;
		case beforemeals:
			while(temp.compareTo(endDate)<=0){
				temp.add(Calendar.DAY_OF_MONTH, 1);
				System.out.println("Nurse give medication to patient"+ temp);
			}
			break;
		case asneeded:
		case forever:
			
			break;
		}
	}
}
