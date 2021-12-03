package co.com.sofka.models.hu12;

import java.util.List;

public class CourseScoresItem{
	private List<CategoryScoreListItem> categoryScoreList;
	private String courseName;
	private String courseId;

	public List<CategoryScoreListItem> getCategoryScoreList(){
		return categoryScoreList;
	}

	public String getCourseName(){
		return courseName;
	}

	public String getCourseId(){
		return courseId;
	}
}