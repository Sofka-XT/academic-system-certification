package co.com.sofka.models.hu06;

import java.util.List;

public class Courses {
	private String courseName;
	private List<Categories> categories;
	private String courseId;

	public String getCourseName(){
		return courseName;
	}

	public List<Categories> getCategories(){
		return categories;
	}

	public String getCourseId(){
		return courseId;
	}
}