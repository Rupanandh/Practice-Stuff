package com.cerner;

import java.util.Calendar;

public class Medication {
	
	private int dosage;
	private Calendar startDate;
	private Calendar endDate;
	
	enum MedicationFrequency{
		EVERY_FOUR_HOURS,
		EVERY_DAY,
		BEFORE_LUNCH,
		BEFORE_SLEEP,
		ON_NEED_BASIS,
		LIFE_TIME
		
	}
	
	
	public Calendar calculateEndDate(Calendar startDate,int dosage,MedicationFrequency medicationFrequency)
	{
		endDate=Calendar.getInstance();
		endDate.setTime(startDate.getTime());
		
		
		switch (medicationFrequency) {
		case EVERY_FOUR_HOURS:
			for(int count=0;count<dosage;count++)
			{
				endDate.add(Calendar.HOUR_OF_DAY,4);
			}
			break;
		case EVERY_DAY:
			for(int count=0;count<dosage;count++)
			{	System.out.println(endDate.getTime());
				endDate.add(Calendar.DAY_OF_MONTH,1);
				
			}
			break;
		case BEFORE_LUNCH:
			for(int count=0;count<dosage;count++)
			{
				endDate.add(Calendar.DAY_OF_MONTH,1);
			}
			break;
		case BEFORE_SLEEP:
			for(int count=0;count<dosage;count++)
			{
				endDate.add(Calendar.DAY_OF_MONTH,1);
			}
			break;
		case ON_NEED_BASIS:
			endDate.add(Calendar.YEAR,9999);
			break;
		case LIFE_TIME:
			endDate.add(Calendar.YEAR,9999);
			break;
		}
			
		return endDate;
		
		
	}
	
	public void notifyNurse(Calendar startDate,Calendar endDate, int doseage,MedicationFrequency medicationFrequency)
	{ 
		if(endDate==null)
		{System.out.println("Start Date:"+startDate.getTime());
		
			if(doseage!=0)
			{endDate =calculateEndDate(startDate, doseage, medicationFrequency);}
			else
			{
				System.out.println("Please input the dosage");
			}
			System.out.println("End date::"+endDate.getTime());
			System.out.println("Start Date:"+startDate.getTime());
		}
		
		switch(medicationFrequency){
		
		case EVERY_FOUR_HOURS:
			 while(startDate.compareTo(endDate)!=0)
			 {
				 startDate.add(Calendar.HOUR_OF_DAY, 4);
				 System.out.println("Nurse please medicate the patient");
			 }
			break;
	
			
		case EVERY_DAY:
			
			 while(startDate.compareTo(endDate)!=0)
			 {
				 startDate.add(Calendar.DAY_OF_MONTH, 1);
				 System.out.println("Nurse please medicate the patient");
			 }
			break;
		case BEFORE_LUNCH:
			 while(startDate.compareTo(endDate)!=0)
			 {
				 startDate.add(Calendar.DAY_OF_MONTH, 1);
				 System.out.println("Nurse please medicate the patient");
			 }
			break;
		case BEFORE_SLEEP:
			 while(startDate.compareTo(endDate)!=0)
			 {
				 startDate.add(Calendar.DAY_OF_MONTH, 1);
				 System.out.println("Nurse please medicate the patient");
			 }
			break;
		case ON_NEED_BASIS:
			
				System.out.println("Nurse please medicate the patient whenever needed");
			
			break;
		case LIFE_TIME:
			 while(startDate.compareTo(endDate)!=0)
			 {
				 startDate.add(Calendar.DAY_OF_MONTH, 1);
				 System.out.println("Nurse please medicate the patient , he is supposed have these pills for lifetime");
			 }
			break;
		}
		
	}

}
