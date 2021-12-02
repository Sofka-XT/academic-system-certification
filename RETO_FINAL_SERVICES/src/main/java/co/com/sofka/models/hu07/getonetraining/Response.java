package co.com.sofka.models.hu07.getonetraining;

import java.util.List;

public class Response{
	private List<CoachesItem> coaches;
	private String trainingId;
	private String name;
	private String program;
	private List<ApprenticesItem> apprentices;
	private String startingDate;

	public List<CoachesItem> getCoaches(){
		return coaches;
	}

	public String getTrainingId(){
		return trainingId;
	}

	public String getName(){
		return name;
	}

	public String getProgram(){
		return program;
	}

	public List<ApprenticesItem> getApprentices(){
		return apprentices;
	}

	public String getStartingDate(){
		return startingDate;
	}
}