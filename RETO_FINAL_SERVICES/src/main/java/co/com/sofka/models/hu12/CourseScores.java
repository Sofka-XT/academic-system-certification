package co.com.sofka.models.hu12;

import java.util.List;

public class CourseScores {
	private List<CategoryScore> categoryScoreList;
	private String courseName;
	private String courseId;

	public List<CategoryScore> getCategoryScoreList(){
		return categoryScoreList;
	}

	public String getCourseName(){
		return courseName;
	}

	public String getCourseId(){
		return courseId;
	}
}