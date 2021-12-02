package co.com.sofka.models.hu12;

import java.util.List;

public class ProfileModel{
	private List<CourseScores> courseScores;
	private String phoneNumber;
	private String apprenticeName;
	private String trainingId;
	private String email;

	public List<CourseScores> getCourseScores(){
		return courseScores;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public String getApprenticeName(){
		return apprenticeName;
	}

	public String getTrainingId(){
		return trainingId;
	}

	public String getEmail(){
		return email;
	}
}