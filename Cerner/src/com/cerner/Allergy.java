package com.cerner;

import java.util.Set;

public class Allergy {
	
	private String allergyName;
	private int allergyId;    
	private Set<String>symptoms;
	private String reporterName;
	private String severity;
	
	enum AllergySeverity{
		CRITICAL,
		HIGH,
		MEDIUM,
		LOW
	}
	
	public void addAllergy(String allergyName, int allergyId,String symptomDescription,String reporterName,AllergySeverity allerySeverity)
	{
		this.allergyName=allergyName;
		this.allergyId=allergyId;
		this.symptoms.add(symptomDescription);
		this.reporterName=reporterName;
		this.severity=allerySeverity.toString();
	}

}
