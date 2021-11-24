package co.com.sofka.models.hu07;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public class ResponseItem{
	private List<CoachesItem> coaches;
	private String trainingId;
	private String name;
	private String program;
	private List<ApprenticesItem> apprentices;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate startingDate;

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

	public LocalDate getStartingDate(){
		return startingDate;
	}
}