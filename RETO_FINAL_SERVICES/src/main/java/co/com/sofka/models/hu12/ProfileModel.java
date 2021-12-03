package co.com.sofka.models.hu12;

import java.util.List;

public class ProfileModel{
	private List<CourseScoresItem> courseScores;
	private String phoneNumber;
	private String apprenticeName;
	private String trainingId;
	private CourseAverageScore courseAverageScore;
	private String email;

	public List<CourseScoresItem> getCourseScores(){
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

	public CourseAverageScore getCourseAverageScore(){
		return courseAverageScore;
	}

	public String getEmail(){
		return email;
	}
}