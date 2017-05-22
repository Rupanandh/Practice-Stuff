package com.cerner;

public class Temperature {
	
	private double bodyTemperature;
	private  int CONVERSION_CONSTANT=32;
	private  double DIVISION_CONSTANT=1.8;
	
	enum UnitType{
		CELSIUS,
		FAHRENHEIT
	}
	
	enum MeasureArea{
		ORAL,
		ARMPIT,
		EAR,
	}
	
	
	public double getBodyTemperature()
	{
		return bodyTemperature;
	}
	
	public void setBodyTemperature(double temperature)
	{
		bodyTemperature = temperature;
	}
	
	public static void main(String[] args ){
		
		Temperature temperature = new Temperature();
		temperature.recordTemperature(37, UnitType.CELSIUS);
		temperature.checkFever(temperature.getBodyTemperature(), MeasureArea.EAR);
	}
	
	public  void recordTemperature(int temperature, UnitType unitType)
	{
		
		if(!unitType.equals(UnitType.CELSIUS))
		{
			setBodyTemperature(convertToCelsius(temperature));
		}
		else{
			setBodyTemperature(temperature);
		}
	}
	
	
	public  double convertToCelsius(int temperature)
	{
		return (temperature-CONVERSION_CONSTANT)/DIVISION_CONSTANT;
	}
	
	public void checkFever(double temperature,MeasureArea measureArea){
		System.out.println("Temperature::"+temperature +" "+ "measureArea "+measureArea);
		switch (measureArea) {
		case ARMPIT:
				if(temperature>=37)
					System.out.println("Patient is suffering from fever");
				else
					System.out.println("Body temperature is normal");
			break;
		case EAR:
			if(temperature>=38)
				System.out.println("Patient is suffering from fever");
			else
				System.out.println("Body temperature is normal");
		break;
		case ORAL:
			if(temperature>=37.5)
				System.out.println("Patient is suffering from fever");
			else
				System.out.println("Body temperature is normal");
		break;
		

		
		}
		
	}

}
